# -*- coding: utf-8 -*-

#4 задача
def shoelaces():
    a = int(input("Введите расстояние между рядами: "))
    b = int(input("Введите расстояние между дырочками в ряду: "))
    l = int(input("Введите длину свободного конца шнурка: "))
    N = int(input("Введите кол-во дырочек в ряду: "))

    return "Длина шнурка равна " + str((2 * N - 1) * a + 2 * l + 2 * (N - 1) * b) + " у.е."

print(shoelaces())