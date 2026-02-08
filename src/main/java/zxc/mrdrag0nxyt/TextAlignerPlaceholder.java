package zxc.mrdrag0nxyt;

import me.clip.placeholderapi.PlaceholderAPI;
import me.clip.placeholderapi.expansion.PlaceholderExpansion;
import org.bukkit.OfflinePlayer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class TextAlignerPlaceholder extends PlaceholderExpansion {
    private static final String SPACE = " ";

    @Override
    public @NotNull String getIdentifier() {
        return "textaligner";
    }

    @Override
    public @NotNull String getAuthor() {
        return "MrDrag0nXYT (drakoshaslv)";
    }

    @Override
    public @NotNull String getVersion() {
        return "1.1.0";
    }

    @Override
    public boolean persist() {
        return true;
    }


    /*
     * %textaligner_center;<length>;<Text with {placeholder}>%
     * %textaligner_right;<length>;<Text with {placeholder}>%
     * %textaligner_between;<length>;<Left text with {placeholder}>;<Right text with {placeholder}>%
     */
    @Override
    public @Nullable String onRequest(OfflinePlayer player, @NotNull String paramsString) {
        String[] params = paramsString.split(";");
        if (params.length < 3) return null;

        String action = params[0];
        Integer length = parseIntOrNull(params[1]);
        if (length == null) return null;

        return switch (action) {
            case "center" -> handleTextAlign(player, params, length, true);
            case "right" -> handleTextAlign(player, params, length, false);
            case "between" -> handleBetweenTextAlign(player, params, length);
            default -> null;
        };
    }


    private String handleTextAlign(OfflinePlayer player, String @NotNull [] params, int length, boolean isCenter) {
        String parsed = PlaceholderAPI.setBracketPlaceholders(player, params[2]);

        int diff = length - parsed.length();
        if (diff <= 0) return parsed;

        int spaces = isCenter ? diff / 2 : diff;
        return SPACE.repeat(spaces) + parsed;
    }

    private @Nullable String handleBetweenTextAlign(OfflinePlayer player, String @NotNull [] params, int length) {
        if (params.length < 4) return null;

        String parsedLeft = PlaceholderAPI.setBracketPlaceholders(player, params[2]);
        String parsedRight = PlaceholderAPI.setBracketPlaceholders(player, params[3]);

        int spaces = length - parsedLeft.length() - parsedRight.length();
        if (spaces <= 0) return parsedLeft + SPACE + parsedRight;

        return parsedLeft + SPACE.repeat(spaces) + parsedRight;
    }


    private @Nullable Integer parseIntOrNull(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException ignored) {
            return null;
        }
    }
}