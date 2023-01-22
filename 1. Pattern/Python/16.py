# A 
# B B 
# C C C 
# D D D D 
# E E E E E 

def alphaRamp(n):
    letter = 65
    for i in range(0,n):
        for j in range(0,i+1):
            print(chr(letter),end=" ")
        letter = letter+1
        print("\r")

        
n = int(input())
alphaRamp(n)