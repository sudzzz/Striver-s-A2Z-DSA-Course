# cook your dish here
#Selection Sort


def bubbleSort(arr,n):
    for i in range(n):
        swapDone = 0
        for j in range(n-i-1):
            if arr[j] > arr[j+1]:
                # swapping the elements to sort the array
                (arr[j], arr[j+1]) = (arr[j+1], arr[j])
                swapDone = 1
        if swapDone == 0:
            break

n = int(input())
arr = list(map(int,input().strip().split()))
bubbleSort(arr,n)
for num in arr:
    print(num,end=" ")