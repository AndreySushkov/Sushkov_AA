# -- coding: utf-8 --
n = int(input())
i = 2

def SmallestDivisorN(n, i):
    while n % i != 0:
        i += 1
    print(i)

SmallestDivisorN(n, i)