# cook your dish here
#Find the element that appears once and others twice in an array
import sys

def findSingleElement(arr,n):
    xor1 = 0
    for i in range(0,n):
        xor1 = xor1 ^ arr[i]
    return xor1

n = int(input())
arr = list(map(int,input().strip().split()))
singleElement = findSingleElement(arr,n)
print(singleElement)