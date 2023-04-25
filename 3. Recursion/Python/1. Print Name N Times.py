# cook your dish here
#Print name n times using Recursion


def printName(n):
   if(n==0):
       return
   print("My Name is Sudhir Daga")
   printName(n-1)


n = int(input())
printName(n)