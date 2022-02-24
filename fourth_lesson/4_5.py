# -*- coding: utf-8 -*-

#5 задача

def str_(inp):
    if inp.count("f") == 1:
        print(-1)
    elif inp.count("f") == 0:
        pass
    else:
        print(str(inp.find("f")) + " " + str(inp.rfind("f")))

inp = input("Введите строку: ")
str_(inp)