# cook your dish here
#Two Sum Problem in an array
import sys

def twoSumProblemBrute(arr,n,target):
    for i in range(0,n):
        for j in range(i+1,n):
            if(arr[i]+arr[j] == target):
                return "Yes"
    return "No"
    
def twoSumProblemBetterWithHashing(arr,n,target):
    mpp = {}
    for i in range(0,n):
        rem = target - arr[i]
        if(mpp.get(rem)!=None):
            return "Yes"
        mpp[arr[i]] = i
    return "No"
    
def twoSumProblemOptimalWithTwoPointerApproach(arr,n,target):
    left = 0
    right = n-1
    arr.sort()
    while(left < right):
        s = arr[left] + arr[right]
        if(s == target):
            return "Yes"
        elif (s > target):
            right = right-1
        else:
            left = left + 1
    return "No"

n = int(input())
arr = list(map(int,input().strip().split()))
k = int(input())
result = twoSumProblemOptimalWithTwoPointerApproach(arr,n,k)
print(result)