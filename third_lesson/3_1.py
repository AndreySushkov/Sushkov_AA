# -*- coding: utf-8 -*-

#1 задача

def AtoB():
    a = int(input("Введите число A: "))
    b = int(input("Введите число B: "))

    for i in range(a, b+1):
        print(i)
        
    return "Конец цикла"

print(AtoB())