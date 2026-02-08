<div align="center">
  <h1>TextAligner</h1>
  <p>Простое расширение для PlaceholderAPI для настройки выравнивания текста</p>
  <b><a href="README.md">English</a></b> | <u>Russian</u>
</div>

# 🤔 Как это работает?

Это расширение добавляет пробелы перед строкой для выравнивания до указанного количества символов

<details><summary>Пример использования с DeluxeMenus</summary>

```yaml
items:
  welcome:
    material: GLOWSTONE
    slot: 22
    display_name: "&#676767+=========================+"
    lore:
      - "&#fcfcfc          Centered text" # вручную
      - "&#fcfcfc%textaligner_center;32;{luckperms_prefix} {player_name}%" # с плейсхолдером
      - " "
      - "&#fcfcfc                           Right text" # вручную
      - "&#fcfcfc%textaligner_right;32;{luckperms_prefix} {player_name}%" # с плейсхолдером
      - " "
      - "&#fcfcfcBetween                        text" # вручную
      - "&#fcfcfc%textaligner_between;32;{luckperms_prefix};{player_name}%" # с плейсхолдером
      - " "
      - "&#676767+=========================+"
```

![deluxemenus-showcase.png](docs/deluxemenus-showcase.png)

</details>

# 📌 Плейсхолдеры

- `%textaligner_center;<length>;<Text with {placeholder}>%`
- `%textaligner_right;<length>;<Text with {placeholder}>%`
- `%textaligner_between;<length>;<Left text with {placeholder}>;<Right text with {placeholder}>%`

Где:

- `<length>` - длина строки под которую нужно выровнять;
- `<Text with {placeholder}>` - текст с плейсхолдерами из PlaceholderAPI с `{}` вместо `%`

Замените своими значениями без `<>`, например: `%textaligner_center;32;Привет, {luckperms_prefix} {player_name}%`

# 💾 Системные требования

- Java **16+**
- Paper **1.16.5+**

# 🚀 Начало работы

1. Установите плагин [PlaceholderAPI](https://spigotmc.org/resources/6245) и перезапустите сервер
2. Установите [TextAlignerPlaceholder](https://github.com/MrDrag0nXYT/TextAlignerPlaceholder/releases/latest) в папку
   `/plugins/PlaceholderAPI/expansions/`
3. Используйте для запуска команду `/papi register TextAlignerPlaceholder-[VERSION].jar` или перезапустите сервер.
   _(Замените [VERSION] на версию TextAlignerPlaceholder)_

# ⚙️ Дополнительно

### Также (по желанию) вы можете дать мне денег:

- [DonationAlerts](https://www.donationalerts.com/r/mrdrag0nxyt)
- TON: `UQAwUJ_DWQ26_b94mFAy0bE1hrxVRHrq51umphFPreFraVL2`
- ETH: `0xf5D0Ab258B0f8EeA7EA07cF1050B35cc12E06Ab0`
- SOL: `4t9q2curHY4EL2skydjzUZ5JvbrLEmkZN5gHBu6qTPyN`
