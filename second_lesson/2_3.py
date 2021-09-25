# -*- coding: utf-8 -*-

#3 задача
def time():
    n = int(input("Введите кол-во минут: "))
    hours = n//60
    minutes = n%60

    if hours >= 24:
        hours %= 24
    
    return "На часах " + str(hours) + " : " + str(minutes)

print(time())