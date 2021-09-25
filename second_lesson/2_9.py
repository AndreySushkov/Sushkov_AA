# -*- coding: utf-8 -*-

#9 задание
def pieceChocolate():
    n = int(input())
    m = int(input())
    k = int(input())

    if n * m > k and (k % m == 0 or k % n == 0):
        return "Да"
    else:
        return "Нет"

print(pieceChocolate())