# A B C D E 
# A B C D 
# A B C 
# A B 
# A 

def nLetterTriangle(n):
    for i in range(0,n):
        letter = 65
        for j in range(n-i,0,-1):
            print(chr(letter),end=" ")
            letter = letter+1
        print("\r")

        
n = int(input())
nLetterTriangle(n)