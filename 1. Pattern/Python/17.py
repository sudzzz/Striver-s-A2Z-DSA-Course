#      A     
#     ABA    
#   ABCBA   
#   ABCDCBA  
#  ABCDEDCBA 

def alphaHill(n):
    for i in range(0,n):
        for j in range(0,n-i):
            print(" ",end="")
        letter = 65
        breakpoint = (2*i+1)/2
        for j in range (0,(2*i+1)):
            print(chr(letter),end="")
            if j < breakpoint-1:
                letter = letter+1
            else:
                letter = letter-1
        for j in range(0,n-i):
            print(" ",end="")
        print("\r")

        
n = int(input())
alphaHill(n)