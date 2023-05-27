/*
Find missing number in an array
*/

#include <bits/stdc++.h>
using namespace std;


int findMissingNumberBruteFore(int arr[],int n){
    for(int i=1;i<=n;i++){
        int flag = 0;
        for(int j=0;j<n-1;j++){
            if(arr[j]==i){
                flag = 1;
                break;
            }
        }
        if(flag==0){
            return i;
        }
    }
    return -1;
}
    
int findMissingNumberBetter(int arr[],int n){
    int hash[n+1] = {0};
    for(int i=0;i<n-1;i++){
        hash[arr[i]] = 1;
    }
    for(int i=1;i<n;i++){
        if(hash[i]==0){
            return i;
        }
    }
    return -1;
}
    
int findMissingNumberOptimalUsingSum(int arr[],int n){
    int sum = (n*(n+1))/2;
    int arr_sum = 0;
    for(int i=0;i<n-1;i++){
        arr_sum += arr[i];
    }
    return sum - arr_sum;
}
    
int findMissingNumberOptimalUsingXorWithTwoArrayTraversal(int arr[],int n){
    int xor1=0,xor2=0;
    for(int i=1;i<=n;i++){
        xor1 = xor1 ^ i;
    }
    for(int i=0;i<n-1;i++){
        xor2 = xor2 ^ arr[i];
    }
    return xor1 ^ xor2;
}
    
int findMissingNumberOptimalUsingXorWithOneArrayTraversal(int arr[],int n){
    int xor1=0,xor2=0;
    for(int i=0;i<n-1;i++){
        xor1 = xor1 ^ (i+1);
        xor2 = xor2 ^ arr[i];
    }
    xor1 = xor1 ^ n;
    return xor1 ^ xor2;
}


int main() {
    //Write your code here
    int n;
    cin >> n;
    int arr[n-1];
    for(int i=0;i<n-1;i++){
        cin >> arr[i];
    }
    int missingNumber = findMissingNumberOptimalUsingXorWithOneArrayTraversal(arr,n);
    cout << missingNumber;
    return 0;
}