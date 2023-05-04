# cook your dish here
#Recursive Bubble Sort


def recursiveBubbleSort(arr,n):
    if(n==1):
        return
    for j in range(n-1):
        if(arr[j]>arr[j+1]):
            (arr[j],arr[j+1]) = (arr[j+1],arr[j])

    recursiveBubbleSort(arr,n-1)

n = int(input())
arr = list(map(int,input().strip().split()))
recursiveBubbleSort(arr,n)
for num in arr:
    print(num,end=" ")