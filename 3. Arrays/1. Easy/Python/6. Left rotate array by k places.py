# cook your dish here
#Left rotate elements of array by d places
import sys

def leftRotateArray(arr,n,d):
    temp = []
    for i in range(0,d):
        temp.append(arr[i])
    for i in range(d,n):
        arr[i-d] = arr[i]
    for i in range(n-d,n):
        arr[i] = temp[i-(n-d)]

def reverse(arr,start,end):
    while(start<end):
        temp = arr[start]
        arr[start] = arr[end]
        arr[end] = temp
        start = start+1
        end = end-1 
        
def leftRotateArrayOptimal(arr,n,d):
    reverse(arr,0,d-1)
    reverse(arr,d,n-1)
    reverse(arr,0,n-1)


n = int(input())
arr = list(map(int,input().strip().split()))
d = int(input())
leftRotateArrayOptimal(arr,n,d%n)
for i in range(0,n):
    print(arr[i],end=" ")