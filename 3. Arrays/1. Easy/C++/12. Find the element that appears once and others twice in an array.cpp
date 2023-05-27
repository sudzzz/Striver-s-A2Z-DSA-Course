/*
Find the element that appears once and others twice in an array
*/

#include <bits/stdc++.h>
using namespace std;


int findSingleElement(int arr[],int n){
    int xor1 = 0;
    for(int i=0;i<n;i++){
        xor1 = xor1 ^ arr[i];
    }
    return xor1;
}

int main() {
    //Write your code here
    int n;
    cin >> n;
    int arr[n];
    for(int i=0;i<n;i++){
        cin >> arr[i];
    }
    int singleElement = findSingleElement(arr,n);
    cout << singleElement;
    return 0;
}