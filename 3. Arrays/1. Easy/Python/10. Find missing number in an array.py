# cook your dish here
#Find missing number in an array
import sys

def findMissingNumberBruteFore(arr,n):
    for i in range(1,n+1):
        flag = 0
        for j in range(0,n-1):
            if(arr[j]==i):
                flag = 1
                break
        if(flag==0):
            return i

def findMissingNumberBetter(arr,n):
    hash_array = [0] * (n+1)
    for i in range(0,n-1):
        hash_array[arr[i]] = 1
    for i in range(1,n):
        if(hash_array[i]==0):
            return i

def findMissingNumberOptimalUsingSum(arr,n):
    sum_of_elements = (n*(n+1))//2
    arr_sum = 0
    for i in range(0,n-1):
        arr_sum = arr_sum + arr[i]
    return sum_of_elements - arr_sum
    
def findMissingNumberOptimalUsingXorWithTwoArrayTraversal(arr,n):
    xor1=0
    xor2=0
    for i in range(1,n+1):
        xor1 = xor1 ^ i
    for i in range(0,n-1):
        xor2 = xor2 ^ arr[i]
    return xor1 ^ xor2
    
def findMissingNumberOptimalUsingXorWithOneArrayTraversal(arr,n):
    xor1=0
    xor2=0
    for i in range(0,n-1):
        xor1 = xor1 ^ (i+1)
        xor2 = xor2 ^ arr[i]
    xor1 = xor1 ^ n
    return xor1 ^ xor2

n = int(input())
arr = list(map(int,input().strip().split()))
missingNumber = findMissingNumberOptimalUsingXorWithOneArrayTraversal(arr,n)
print(missingNumber)