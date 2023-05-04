# cook your dish here
#Quick Sort


def partition(arr,low,high):
    pivot = arr[low]
    i = low
    j = high
    while(i<j):
        while(arr[i]<=pivot and i<high):
            i = i+1
        while(arr[j]>pivot and j>low):
            j = j-1
        if(i<j):
            (arr[i],arr[j]) = (arr[j],arr[i])
    (arr[low],arr[j]) = (arr[j],arr[low])
    return j
    
def quickSort(arr,low,high):
    if(low<high):
        pIndex = partition(arr,low,high);
        quickSort(arr,low,pIndex-1);
        quickSort(arr,pIndex+1,high);

n = int(input())
arr = list(map(int,input().strip().split()))
quickSort(arr,0,n-1)
for num in arr:
    print(num,end=" ")