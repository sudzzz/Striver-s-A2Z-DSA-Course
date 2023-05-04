# cook your dish here
#Recursive Insertion Sort


def recursiveInsertionSort(arr,i,n):
    if(i==n):
        return
    j = i
    while(j>0 and arr[j-1]>arr[j]):
        (arr[j],arr[j-1]) = (arr[j-1],arr[j])
        j = j -1 

    recursiveInsertionSort(arr,i+1,n)

n = int(input())
arr = list(map(int,input().strip().split()))
recursiveInsertionSort(arr,1,n)
for num in arr:
    print(num,end=" ")