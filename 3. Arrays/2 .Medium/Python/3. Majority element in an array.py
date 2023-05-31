# cook your dish here
#Majority element in an array
import sys

def majorityElementInArrayBrute(arr,n):
    for i in range(0,n):
        cnt = 0
        for j in range(0,n):
            if(arr[j]==arr[i]):
                cnt = cnt+1
        if(cnt > (n//2)):
            return arr[i]
    return -1
    
def majorityElementInArrayBetter(arr,n):
    mpp = {}
    for i in range(0,n):
        if(mpp.get(arr[i])!=None):
            mpp[arr[i]] = mpp[arr[i]]+1
        else:
            mpp[arr[i]] = 1
    for key in mpp:
        if(mpp[key] > (n/2)):
            return key
    return -1
 
#Moore's Vote Algorithm  
def majorityElementInArrayOptimal(arr,n):
    cnt = 0
    el = 0
    for i in range(0,n):
        if(cnt==0):
            cnt = 1
            el = arr[i]
        elif(arr[i]==el):
            cnt = cnt+1
        else:
            cnt = cnt-1
    cnt1 = 0
    for i in range(0,n):
        if(arr[i]==el):
            cnt1 = cnt1+1
    if(cnt1 > (n/2)):
        return el
    return -1

n = int(input())
arr = list(map(int,input().strip().split()))
result = majorityElementInArrayOptimal(arr,n)
print(result)