# cook your dish here
#Find intersection of two sorted arrays
import sys

def intersectionOfSortedArraysBruteForce(arr1,arr2):
    n1 = len(arr1)
    n2 = len(arr2)
    ans = []
    visited = []
    for i in range(0,n2):
        visited.append(0)
    for i in range(0,n1):
        for j in range(0,n2):
            if(arr1[i]==arr2[j] and visited[j]==0):
                ans.append(arr1[i])
                visited[j]=1
                break
            if(arr2[j]>arr1[i]):
                break
    return ans
    
def intersectionOfSortedArraysOptimal(arr1,arr2):
    n1 = len(arr1)
    n2 = len(arr2)
    i=0
    j=0
    ans = []
    while(i<n1 and j<n2):
        if(arr1[i]<arr2[j]):
            i=i+1
        elif(arr1[i]==arr2[j]):
            ans.append(arr1[i])
            i=i+1
            j=j+1
        else:
            j=j+1
    return ans

n1 = int(input())
arr1 = list(map(int,input().strip().split()))
n2 = int(input())
arr2 = list(map(int,input().strip().split()))
ans = intersectionOfSortedArraysOptimal(arr1,arr2)
for element in ans:
    print(element,end=" ")