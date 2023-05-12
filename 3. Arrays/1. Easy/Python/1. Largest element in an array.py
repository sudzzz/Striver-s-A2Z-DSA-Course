# cook your dish here
#Find largest element in an array


def findLargest(arr,n):
    largest = arr[0]
    for i in range (0,n):
        if(arr[i]>largest):
            largest = arr[i]
    return largest

n = int(input())
arr = list(map(int,input().strip().split()))
largest = findLargest(arr,n)
print(largest)