# -*- coding: utf-8 -*-

#4 задача

def sumn():
    N = int(input("Введите количество чисел: "))
    arr = [0] * N

    for i in range(N):
        arr[i] = int(input(f"Введите {i+1} число: "))
    return "Сумма равна " + str(sum(arr))

print(sumn())