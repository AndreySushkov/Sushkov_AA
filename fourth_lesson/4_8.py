# -*- coding: utf-8 -*-

#8 задача

def str_(inp):
    if inp.count("h") >= 2:
        b = inp[(inp.find("h") + 1):(inp.rfind("h"))]
        inp = inp[:(inp.find("h") + 1)] + b[::-1] + inp[inp.rfind("h"):]
    print(inp)

inp = input("Введите строку: ")
str_(inp)