# A 
# A B 
# A B C 
# A B C D 
# A B C D E 

def nLetterTriangle(n):
    for i in range(1,n+1):
        letter = 65
        for j in range(1,i+1):
            print(chr(letter),end=" ")
            letter = letter+1
        print("\r")

        
n = int(input())
nLetterTriangle(n)