# -*- coding: utf-8 -*-

#7 задача

def str_(inp):
    if inp.count("h") >= 2:
        inp = inp[:inp.find("h")] + inp[(inp.rfind("h") + 1):]
    print(inp)

inp = input("Введите строку: ")
str_(inp)