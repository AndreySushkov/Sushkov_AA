# -- coding: utf-8 --
def OnlyZeroEnd():
    num = 1
    num_pred = 0
    count = 0
    while num != 0:
        num = int(input())
        if num > num_pred:
            count += 1
        num_pred = num
    print(count - 1)

OnlyZeroEnd()