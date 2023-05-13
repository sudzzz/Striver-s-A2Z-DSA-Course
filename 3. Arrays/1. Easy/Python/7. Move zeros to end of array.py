# cook your dish here
#Move zeros to end of array
import sys

def swap(arr,i,j):
    temp = arr[i]
    arr[i] = arr[j]
    arr[j] = temp

def moveZerosToEndBrute(arr,n):
    temp = []
    for i in range(0,n):
        if(arr[i]!=0):
            temp.append(arr[i])
    for i in range(0,len(temp)):
        arr[i] = temp[i]
    for i in range(len(temp),n):
        arr[i] = 0

def moveZerosToEndOptimal(arr,n):
    j = -1
    for i in range(0,n):
        if(arr[i]==0):
            j=i
            break
    if(j==-1):
        return
    for i in range(j+1,n):
        if(arr[i]!=0):
            swap(arr,i,j)
            j=j+1

n = int(input())
arr = list(map(int,input().strip().split()))
moveZerosToEndOptimal(arr,n)
for i in range(0,n):
    print(arr[i],end=" ")