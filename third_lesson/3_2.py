# -*- coding: utf-8 -*-

#2 задача

def ABtoBA():
    a = int(input("Введите число A: "))
    b = int(input("Введите число B: "))

    if a < b:
        for i in range(a, b+1):
            print(i)
    else:
        for i in range(a, b-1, -1):
            print(i)
            
    return "Конец цикла"

print(ABtoBA())