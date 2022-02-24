# -- coding: utf-8 --
n = int(input())
step = 0
num = 1

def GreatestDegree(n, step, num):
    while num <= n:
        step += 1
        num *= 2;
    print(step - 1, " ", num // 2)

GreatestDegree(n, step, num)