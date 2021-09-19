# Thiết kế function tính giá trị lớn nhất (value) của một dictionary cho trước.

def max(**args):
    max = 0
    for value in args:
        if args[value] > max:
            max = args[value]
    return max
print(max(a = 10, b = 9, c = 1100, d = 110))