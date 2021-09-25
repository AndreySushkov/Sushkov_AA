# -*- coding: utf-8 -*-

#8 задача
def sov():
    a = int(input("Введите первое число: "))
    b = int(input("Введите второе число: "))
    c = int(input("Введите третье число: "))

    count = 0
    if a == b:
        count += 1
    if a == c:
        count += 1
    if b == c:
        count += 1
    
    if count == 1:
        return count * 2
    else:
        return count

print(sov())