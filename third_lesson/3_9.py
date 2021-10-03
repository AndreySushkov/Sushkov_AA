# -*- coding: utf-8 -*-

#9 задача

def fiboSum():
    N = int(input("Введите число N: "))
    f_arr = [0, 1]

    for i in range(3, N+1):
        f_arr.append(f_arr[-1]+f_arr[-2])
    return sum(f_arr)

print(fiboSum())