# cook your dish here
#Sort an arrays of 0's 1's and 2's
import sys

def swap(arr,i,j):
    temp = arr[i]
    arr[i] = arr[j]
    arr[j] = temp

def sortArrayOf012Brute(arr):
    arr.sort()
    
def sortArrayOf012Better(arr,n):
    cnt0 = 0
    cnt1 = 0
    cnt2 = 0
    for i in range(0,n):
        if(arr[i]==0):
            cnt0 = cnt0+1
        elif(arr[i]==1):
            cnt1 = cnt1+1
        else:
            cnt2 = cnt2+1
    for i in range(0,cnt0):
        arr[i] = 0
    for i in range(0,cnt1):
        arr[i+cnt0] = 1
    for i in range(0,cnt2):
        arr[i+cnt0+cnt1] = 2
 
#Dutch National Flag ALgorithm   
def sortArrayOf012Optimal(arr,n):
    low = 0
    mid = 0
    high = n-1
    while(mid <= high):
        if(arr[mid]==0):
           swap(arr,low,mid)
           low = low + 1
           mid = mid + 1
        elif(arr[mid]==1):
            mid = mid + 1
        else:
            swap(arr,mid,high)
            high = high - 1

n = int(input())
arr = list(map(int,input().strip().split()))
sortArrayOf012Optimal(arr,n)
for i in range(0,n):
    print(arr[i],end=" ")