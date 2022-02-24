# -- coding: utf-8 --
n = int(input())
num = 1

def NInSquare(n, num):
    while num**2 < n:
        print(num**2)
        num += 1

NInSquare(n, num)