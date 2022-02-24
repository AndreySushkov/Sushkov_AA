# -*- coding: utf-8 -*-

#6 задача

def str_(inp):
    if inp.count("f") == 1:
        print(-1)
    elif inp.count("f") == 0:
        print(-2)
    else:
        print(inp.find("f", inp.find("f") + 1))

inp = input("Введите строку: ")
str_(inp)