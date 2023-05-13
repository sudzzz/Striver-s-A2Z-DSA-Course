# cook your dish here
#Linear search in an array
import sys

def linearSearch(arr,n,num):
    for i in range(0,n):
        if(arr[i]==num):
            return i
    return -1

n = int(input())
arr = list(map(int,input().strip().split()))
num = int(input())
ans = linearSearch(arr,n,num)
print(ans)