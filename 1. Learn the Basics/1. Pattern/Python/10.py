# *
# **
# ***
# ****
# *****
# ****
# ***
# **
# *

def nStarTriangle(n):
    for i in range(0,2*n-1):
        if i<n :
            for j in range(0,i+1):
                print("*",end="")
        else:
            for j in range(i,2*n-1):
                print("*",end="")
        print("\r")

        
n = int(input())
nStarTriangle(n)