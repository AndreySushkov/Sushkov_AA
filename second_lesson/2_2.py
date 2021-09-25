# -*- coding: utf-8 -*-

#2 задача
def sTriangle():
    kat_1 = int(input("Ведите первый катет: "))
    kat_2 = int(input("Ведите второй катет: "))

    return "Площадь треугольника равна " + str(0.5 * kat_1 * kat_2)
print(sTriangle())