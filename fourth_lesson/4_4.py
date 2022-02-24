# -*- coding: utf-8 -*-

#4 задача

def str_(inp):
    new_inp = inp[(inp.find(" ") + 1):] + " " + inp[:inp.find(" ")]
    print(new_inp)

inp = input("Введите строку: ")
str_(inp)