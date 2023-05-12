# cook your dish here
#Find second largest and second smallest element in an array
import sys

def findSecondLargest(arr,n):
    largest = arr[0]
    secondLargest = -sys.maxsize - 1
    for i in range (1,n):
        if(arr[i]>largest):
            secondLargest = largest
            largest = arr[i]
        elif(arr[i]<largest and arr[i]>secondLargest):
            secondLargest = arr[i]
    return secondLargest
    
def findSecondSmallest(arr,n):
    smallest = arr[0]
    secondSmallest = sys.maxsize
    for i in range(1,n):
        if(arr[i]<smallest):
            secondSmallest = smallest
            smallest = arr[i]
        elif(arr[i]!=smallest and arr[i]<secondSmallest):
            secondSmallest = smallest
    return secondSmallest

n = int(input())
arr = list(map(int,input().strip().split()))
secondLargest = findSecondLargest(arr,n)
secondSmallest = findSecondSmallest(arr,n)
print(secondLargest)
print(secondSmallest)