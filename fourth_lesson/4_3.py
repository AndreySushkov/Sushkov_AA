# -*- coding: utf-8 -*-

#3 задача

def str_(inp):
    new_inp = inp[int((len(inp) + 1) / 2):] + inp[:int((len(inp) + 1) / 2)]
    print(new_inp)

inp = input("Введите строку: ")
str_(inp)