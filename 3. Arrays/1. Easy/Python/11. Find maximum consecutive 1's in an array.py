# cook your dish here
#Find maximum consecutive One's in an array
import sys

def findMaximumConsecutiveOnes(arr,n):
    counter = 0
    maximum = 0
    for i in range(0,n):
        if(arr[i]==1):
            counter = counter+1
            maximum = max(maximum,counter)
        else:
            counter = 0
    return maximum;

n = int(input())
arr = list(map(int,input().strip().split()))
maximumConsecutiveOnes = findMaximumConsecutiveOnes(arr,n)
print(maximumConsecutiveOnes)