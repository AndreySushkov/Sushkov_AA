# -*- coding: utf-8 -*-

#10 задача

def fiboSum():
    N = int(input("Введите число N: "))
    k = int(input("Введите число k: "))
    past_num = 0
    present_num = 1
    sumn = 0

    for i in range(2, N+1):
        if k <= i:
            sumn += present_num

        time = present_num
        present_num += past_num
        past_num = time

    return sumn

print(fiboSum())