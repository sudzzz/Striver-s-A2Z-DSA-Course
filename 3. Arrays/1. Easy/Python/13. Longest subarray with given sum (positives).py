# cook your dish here
#Longest Subarray With Sum K (Poitivies and Zero)
import sys

def longestSubArrayWithSumKContainingPositivesBrute(arr,n,k):
    maxLen = 0
    for i in range(0,n):
        sum_arr = 0
        for j in range(i,n):
            sum_arr = sum_arr + arr[j]
            if(sum_arr == k):
                maxLen = max(maxLen,j-i+1)
    return maxLen
    
def longestSubArrayWithSumKContainingPositivesBetter(arr,n,k):
    preSumMap = {}
    maxLen = 0
    sum_arr = 0
    for i in range(0,n):
        sum_arr = sum_arr + arr[i]
        if(sum_arr == k):
            maxLen = max(maxLen,i+1)
        rem = sum_arr - k
        if(preSumMap.get(rem)!=None):
            l = i - preSumMap[rem]
            maxLen = max(maxLen,l)
        if(preSumMap.get(sum_arr)==None):
            preSumMap[sum_arr] = i
    return maxLen

def longestSubArrayWithSumKContainingPositivesOptimal(arr,n,k):
    left = 0
    right = 0
    maxLen = 0
    sum_arr = arr[0]
    while(right < n):
        while(left <= right and sum_arr > k):
            sum_arr = sum_arr - arr[left]
            left = left + 1
        if(sum_arr == k):
            maxLen = max(maxLen,right-left+1)
        right = right + 1
        if(right<n):
            sum_arr = sum_arr + arr[right]
    return maxLen

n = int(input())
arr = list(map(int,input().strip().split()))
k = int(input())
maxLen = longestSubArrayWithSumKContainingPositivesOptimal(arr,n,k)
print(maxLen)