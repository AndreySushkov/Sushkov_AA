# -*- coding: utf-8 -*-

#6 задача

def fact():
    n = int(input("Введите число n: "))
    fact = 1

    for i in range(1, n+1):
        fact *= i
    return fact

print(fact())