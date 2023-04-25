# cook your dish here
#Reverse an array using Recursion
#Both the swap functions work in same way.


def swap(arr,l,r):
    k = arr[l]
    arr[l] = arr[r]
    arr[r] = k

def swap2(arr,l,r):
    arr[l], arr[r] = arr[r], arr[l]

def reverseArray(arr,l,r):
    if(l>=3):
        return
    swap(arr,l,r)
    reverseArray(arr,l+1,r-1)
    
#Instead of using two pointers we can achive the same using one parameter. If l = i, then r = n-i-1 and it will
#keep on swapping till i>=n/2

def reverseArrayUsingOneParameter(arr,i):
    if(i>=n/2):
        return
    swap2(arr,i,n-i-1)
    reverseArrayUsingOneParameter(arr,i+1)
   
n = int(input())
arr = list(map(int,input().strip().split()))
reverseArray(arr,0,n-1)
for i in arr:
    print(i,end=" ")
reverseArrayUsingOneParameter(arr,0)
print()
for i in arr:
    print(i,end=" ")
