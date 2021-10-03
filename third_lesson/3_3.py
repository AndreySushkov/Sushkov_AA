# -*- coding: utf-8 -*-

#3 задача

def nechet():
    a = int(input("Введите число A: "))
    b = int(input("Введите число B: "))

    for i in range(a, b-1, -1):
        if i % 2 != 0:
            print(i)

    return "Конец цикла"

print(nechet())