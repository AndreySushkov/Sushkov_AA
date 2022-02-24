# -- coding: utf-8 --
x = int(input())
y = int(input())
days = 0
s = 0

def Probeg(x, y, days, s):
    while s < y:
        s += x
        x *= 1.1
        days += 1
    print(days)

Probeg(x, y, days, s)