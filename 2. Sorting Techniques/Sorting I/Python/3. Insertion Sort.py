# cook your dish here
#Selection Sort


def insertionSort(arr,n):
    for i in range(n):
        j = i
        while(j>0 and arr[j-1]>arr[j]):
            (arr[j], arr[j-1]) = (arr[j-1], arr[j])
            j = j-1

n = int(input())
arr = list(map(int,input().strip().split()))
insertionSort(arr,n)
for num in arr:
    print(num,end=" ")