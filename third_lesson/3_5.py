# -*- coding: utf-8 -*-

#5 задача

def sumAndDegree():
    n = int(input("Введите число n: "))
    sumn = 0

    for i in range(1, n+1):
        sumn += i**3
    return sumn

print(sumAndDegree())