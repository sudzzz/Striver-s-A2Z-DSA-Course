# cook your dish here
#Remove duplicate elements from sorted array.
import sys

def removeDuplicate(arr,n):
    i = 0
    for j in range(1,n):
        if(arr[j]!=arr[i]):
            arr[i+1] = arr[j]
            i = i+1
    return i+1


n = int(input())
arr = list(map(int,input().strip().split()))
size = removeDuplicate(arr,n)
for i in range(0,size):
    print(arr[i],end=" ")