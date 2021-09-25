# -*- coding: utf-8 -*-

#4 задача
seconds = int(input())
days = seconds // 86400
hours = (seconds % 86400) // 3600
minutes = ((seconds % 86400) % 3600) // 60
seconds = ((seconds % 86400) % 3600) % 60
print(str(days), ":",str(hours), ":", str(minutes), ":", str(seconds))