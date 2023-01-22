# E 
# D E 
# C D E 
# B C D E 
# A B C D E 

def alphaTriangle(n):
    letter1 = 65+n-1
    for i in range(0,n):
        letter2 = letter1
        for j in range(0,i+1):
            print(chr(letter2),end=" ")
            letter2 = letter2+1
        letter1 = letter1-1
        print("\r")

        
n = int(input())
alphaTriangle(n)