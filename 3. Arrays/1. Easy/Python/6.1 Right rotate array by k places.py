# cook your dish here
#Right rotate elements of array by d places -- It is equivalent to left rotation of array by n-d places.
import sys

def reverse(arr,start,end):
    while(start<end):
        temp = arr[start]
        arr[start] = arr[end]
        arr[end] = temp
        start = start+1
        end = end-1 
        
def rightRotateArrayOptimal(arr,n,d):
    d = n-d
    reverse(arr,0,d-1)
    reverse(arr,d,n-1)
    reverse(arr,0,n-1)


n = int(input())
arr = list(map(int,input().strip().split()))
d = int(input())
rightRotateArrayOptimal(arr,n,d%n)
for i in range(0,n):
    print(arr[i],end=" ")