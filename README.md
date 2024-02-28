## Обработка исключений

Приложение запрашивает у пользователя следующие данные, разделенные пробелом в строгом порядке:

Фамилия Имя Отчество дата_рождения номер_телефона пол

Форматы данных:

- фамилия, имя, отчество - строки
- дата_рождения - строка формата dd.mm.yyyy
- номер_телефона - целое беззнаковое число без форматирования
- пол - символ латиницей f или m.

Приложение проверяет введенные данные по количеству. Если количество не совпадает, возвращает код ошибки и показывает пользователю сообщение, что он ввел меньше и больше данных, чем требуется.

Приложение выделяет из строки требуемые значения и проверяет форматы данных. Если форматы не совпадают, то выбрасывается соответствующее исключение. Пользователю выводится сообщение с информацией, что именно неверно.

Если всё введено и обработано верно, то создается файл с названием, равным фамилии, в него в одну строку записываются данные:

<Фамилия> <Имя> <Отчество> <дата_рождения> <номер_телефона> <пол>

Однофамильцы должны записываются в один и тот же файл, в отдельные строки.

