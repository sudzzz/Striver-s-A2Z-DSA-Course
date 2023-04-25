# 4444444
# 4333334
# 4322234
# 4321234
# 4322234
# 4333334
# 4444444


def getNumberPattern(n):
    for i in range(0,2*n-1):
        for j in range(0,2*n-1):
            top = i
            left = j
            bottom = (2*n-2)-i
            right = (2*n-2)-j
            print(n-min(min(top,bottom),min(left,right)),end="")
        print("\r")

n = int(input())
getNumberPattern(n)