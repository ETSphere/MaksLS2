Задача №2. Деление в столбик
_78945|4
 4    |-----
--    |19736
_38
 36
 --
 _29
  28
  --
  _14
   12
   --
   _25
    24
    --
     1

Входные параметры: пользователь в консоль вводит 2 числа (ругаться если не числа), программа должна поделить первое число на второе В СТОЛБИК.
Остаток от деления должен также указываться в конце этого столбика, а в результат записывается результат целочисленного деления.

Подсказка к проектированию:
- Выделить группу классов model (DivisionStep, DivisionResult - объекты этих классов-моделей должны хранить в себе некоторые данные каждого шага вычисления - dividend/divisor/quotient например)
- Выделить отдельный класс-форматтер, что будет смещать все символы в нужное положение
- Выделить отдельный класс с логикой деления
- для переноса на новую строку используй System.lineSeparator()

