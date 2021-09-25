# -*- coding: utf-8 -*-

#3 задача
age = int(input())
name = input()
if age > 0 and age < 75 and name != "Иван":
    if age >= 16 :
        print("Поздравляем вы поступили в ВГУИТ")
    else:
        print("Сначало нужно окончить школу! Вам осталось отучиться в школе - ", str(16 - age))
else:
    print("ВЫ нам не подходите")