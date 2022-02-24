# -*- coding: utf-8 -*-

#9 задача

def str_(inp, symb):
    inp = inp.replace(symb, "")
    print(inp)

inp = input("Введите строку: ")
symb = input("Введите символ для удаления: ")
str_(inp, symb)