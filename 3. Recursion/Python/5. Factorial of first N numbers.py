# cook your dish here
#Factorial of first N numbers using Recursion
   
def findFactorial(n):
    if(n==1 or n==0):
        return 1
    return n*findFactorial(n-1)
   
n = int(input())
factorial = findFactorial(n)
print(factorial)
