# cook your dish here
#Left rotate elements of array by 1 place
import sys

def leftRotateByOne(arr,n):
    firstElement = arr[0]
    for i in range(0,n-1):
       arr[i] = arr[i+1]
    arr[n-1] = firstElement


n = int(input())
arr = list(map(int,input().strip().split()))
leftRotateByOne(arr,n)
for i in range(0,n):
    print(arr[i],end=" ")