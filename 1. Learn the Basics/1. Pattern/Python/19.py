# **********
# ****  ****
# ***    ***
# **      **
# *        *
# *        *
# **      **
# ***    ***
# ****  ****
# **********

def upperSymmetry(n):
    inital_spaces = 0
    for i in range(0,n):
        for j in range(1,n-i+1):
            print("*",end="")
        for j in range(0,inital_spaces):
            print(" ",end="")
        for j in range(1,n-i+1):
            print("*",end="")
        inital_spaces = inital_spaces+2
        print("\r")

def lowerSymmetry(n):
    for i in range(1,n+1):
        for j in range(1,i+1):
            print("*",end="")
        for j in range(1,2*(n-i)+1):
            print(" ",end="")
        for j in range(i,0,-1):
            print("*",end="")
        print("\r")
        

n = int(input())
upperSymmetry(n)
lowerSymmetry(n)