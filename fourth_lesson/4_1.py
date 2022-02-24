# -*- coding: utf-8 -*-

#1 задача

def str_(inp):
    print(inp[2])
    print(inp[-2])
    print(inp[:5])
    print(inp[:-2])
    print(inp[0::2])
    print(inp[1::2])
    print(inp[::-1])
    print(inp[::-2])
    print(len(inp))

inp = input("Введите строку: ")
str_(inp)