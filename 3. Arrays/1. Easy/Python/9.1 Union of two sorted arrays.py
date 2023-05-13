# cook your dish here
#Find union of two sorted arrays
import sys

def unionOfSortedArraysBruteForce(arr1,arr2):
    n1 = len(arr1)
    n2 = len(arr2)
    st = set()
    for i in range(0,n1):
        st.add(arr1[i])
    for i in range(0,n2):
        st.add(arr2[i])
    ans = []
    for element in st:
        ans.append(element)
    return ans
    
def unionOfSortedArraysOptimal(arr1,arr2):
    n1 = len(arr1)
    n2 = len(arr2)
    i=0
    j=0
    ans = []
    while(i<n1 and j<n2):
        if(arr1[i]<=arr2[j]):
            if(len(ans)==0 or ans[len(ans)-1]!=arr1[i]):
                ans.append(arr1[i])
            i=i+1
        else:
            if(len(ans)==0 or ans[len(ans)-1]!=arr2[j]):
                ans.append(arr2[j])
            j=j+1
    while(i<n1):
        if(len(ans)==0 or ans[len(ans)-1]!=arr1[i]):
            ans.append(arr1[i])
        i=i+1
    while(j<n2):
        if(len(ans)==0 or ans[len(ans)-1]!=arr2[j]):
            ans.append(arr2[j])
        j=j+1
    return ans

n1 = int(input())
arr1 = list(map(int,input().strip().split()))
n2 = int(input())
arr2 = list(map(int,input().strip().split()))
ans = unionOfSortedArraysOptimal(arr1,arr2)
for element in ans:
    print(element,end=" ")