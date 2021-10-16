# -*- coding: utf-8 -*-

#7 задача

def manyFact():
    n = int(input("Введите число n: "))
    arr = []
    p = 1

    for i in range(1,n+1):
        p *= i
        arr.append(p)
    
    return sum(arr)

print(manyFact())