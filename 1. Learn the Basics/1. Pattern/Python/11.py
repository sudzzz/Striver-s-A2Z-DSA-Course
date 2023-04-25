# 1 
# 0 1 
# 1 0 1 
# 0 1 0 1 
# 1 0 1 0 1 

def nBinaryTriangle(n):
    for i in range(0,n):
        for j in range(0,i+1):
            print((i+j+1)%2,end=" ")
        print("\r")

        
n = int(input())
nBinaryTriangle(n)