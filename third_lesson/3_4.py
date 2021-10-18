# -*- coding: utf-8 -*-

#4 задача

def sumn():
    sumn = 0

    for i in range(int(input("Введите количество чисел: "))):
        sumn += int(input(f"Введите {i+1} число: "))
    return "Сумма равна " + str(sumn)

print(sumn())