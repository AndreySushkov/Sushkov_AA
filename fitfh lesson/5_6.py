# -- coding: utf-8 --
def OnlyZeroEnd():
    s = 0
    len = 0
    num = 1
    while num != 0:
        num = int(input())
        s += num
        len += 1
    print(s / (len - 1))

OnlyZeroEnd()