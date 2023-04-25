# cook your dish here
#Nth Fibonaaci number using Recursion

#Time complexity = 2^n
def fib(n):
    if(n==1 or n==0):
        return n
    return fib(n-1)+fib(n-2)
    
n = int(input())
ans = fib(n)
print(ans)
