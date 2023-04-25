# cook your dish here
#Print linearly from 1 to n using Recursion


def printNum(n):
   if(n==0):
       return
   printNum(n-1)
   print(n)
   
n = int(input())
printNum(n)