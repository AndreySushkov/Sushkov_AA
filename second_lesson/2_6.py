# -*- coding: utf-8 -*-

#6 задача
def chess():
    x_1 = int(input("Введите номер столбца первой клетки: "))
    y_1 = int(input("Введите номер строки первой клетки: "))
    x_2 = int(input("Введите номер столбца второй клетки: "))
    y_2 = int(input("Введите номер строки второй клетки: "))

    if x_1 % 2 == x_2 % 2:
        if y_1 % 2 == y_2 % 2:
            return "Да"
        else:
            return "Нет"
    else:
        if y_1 % 2 != y_2 % 2:
            return "Да"
        else:
            return "Нет"

print(chess())