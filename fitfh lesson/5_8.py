# -- coding: utf-8 --
def OnlyZeroEnd():
    num = 1
    num_pred = 0
    count = 1
    maxc = 0
    while num != 0:
        num = int(input())
        if num == num_pred:
            count += 1
        else:
            if count > maxc:
                maxc = count
            count = 1
        num_pred = num
    print(maxc)

OnlyZeroEnd()