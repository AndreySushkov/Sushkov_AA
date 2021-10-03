# -*- coding: utf-8 -*-

#8 задача

def stairs():
    n = int(input("Ведите кол-во ступенек: "))
    stair = ""

    for i in range(1, n+1):
        stair += f"{i}"
        print(stair)
    return "Конец цикла"

print(stairs())