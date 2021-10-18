# -*- coding: utf-8 -*-

#7 задача

def manyFact():
    n = int(input("Введите число n: "))
    sumn = 0
    p = 1

    for i in range(1,n+1):
        p *= i
        sumn += p
    
    return sumn

print(manyFact())