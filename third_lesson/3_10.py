# -*- coding: utf-8 -*-

#10 задача

def fiboSum():
    N = int(input("Введите число N: "))
    K = int(input("Введите число K: "))
    f_arr = [0, 1]
    sumn = 0

    for i in range(3, N+1):
        f_arr.append(f_arr[-1]+f_arr[-2])
        
        if i >= K:
            sumn += f_arr[i-1]
    return sumn

print(fiboSum())