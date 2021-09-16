# -*- coding: utf-8 -*-

#1 задача
""" print('"Курс Основы программирования начался"') """

#2 задача
""" print(16823 * 12302 % 3092) """

#3 задача
""" age = int(input())
name = input()
if age > 0 and age < 75 and name != "Иван":
    if age >= 16 :
        print("Поздравляем вы поступили в ВГУИТ")
    else:
        print("Сначало нужно окончить школу! Вам осталось отучиться в школе - ", str(16 - age))
else:
    print("ВЫ нам не подходите") """

#4 задача
""" seconds = int(input())
days = seconds // 86400
hours = (seconds % 86400) // 3600
minutes = ((seconds % 86400) % 3600) // 60
seconds = ((seconds % 86400) % 3600) % 60
print(str(days), ":",str(hours), ":", str(minutes), ":", str(seconds)) """

#5 задача
""" n = int(input())
prz = n + n**2 + n**3 + n**4 + n**5
print(prz) """

#6 задача
""" x = input()
y = input()
zam = x
x=y
y=zam
print(x, y) """

#7 задача
""" number = int(input())
if number % 2 == 0:
    print("Число четное")
else:
    print("Число нечетное") """