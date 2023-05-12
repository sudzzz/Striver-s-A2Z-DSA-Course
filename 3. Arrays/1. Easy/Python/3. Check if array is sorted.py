# cook your dish here
#Check if array is sorted or not
import sys

def CheckIsSorted(arr,n):
    for i in range(1,n):
        if(arr[i-1]<=arr[i]):
            continue
        else:
            return False
    return True


n = int(input())
arr = list(map(int,input().strip().split()))
isSorted = CheckIsSorted(arr,n)
if(isSorted):
    print("Sorted")
else:
    print("Not Sorted")