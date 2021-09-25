# -*- coding: utf-8 -*-

#5 задача
def minimum():
    a = int(input("Ведите первое число: "))
    b = int(input("Ведите второе число: "))
    c = int(input("Ведите третье число: "))

    return "Минимальное из них равно " + str(min(a, b, c))

print(minimum())