# cook your dish here
#Longest Subarray With Sum K (Poitivies and Negatives)
import sys

def longestSubArrayWithSumKContainingPositivesAndNegativesBrute(arr,n,k):
    maxLen = 0
    for i in range(0,n):
        sum_arr = 0
        for j in range(i,n):
            sum_arr = sum_arr + arr[j]
            if(sum_arr == k):
                maxLen = max(maxLen,j-i+1)
    return maxLen
    
def longestSubArrayWithSumKWithArrayContainingPositivesAndNegativesOptimal(arr,n,k):
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

n = int(input())
arr = list(map(int,input().strip().split()))
k = int(input())
maxLen = longestSubArrayWithSumKWithArrayContainingPositivesAndNegativesOptimal(arr,n,k)
print(maxLen)