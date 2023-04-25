# cook your dish here
#Summation of first N numbers using Recursion


def findSumUsingParameterisedFunction(n,s):
   if(n==0):
       return s
   s = s+n
   return findSumUsingParameterisedFunction(n-1,s)
   
def findSum(n):
    if(n==0):
        return 0
    return n+findSum(n-1)
   
n = int(input())
sum1 = findSumUsingParameterisedFunction(n,0)
sum2 = findSum(n)
print(sum1)
print(sum2)