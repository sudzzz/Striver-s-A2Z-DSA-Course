/*
Reverse an array using Recursion
*/

#include <bits/stdc++.h>
using namespace std;

void swap(int arr[], int l, int r){
    int a = arr[l];
    arr[l] = arr[r];
    arr[r] = a;
}

void reverseArray(int arr[],int l,int r){
    if(l>=r){
        return;
    }
    swap(arr,l,r);
    reverseArray(arr,l+1,r-1);
}

/*
Instead of using two pointers we can achive the same using one parameter. If l = i, then r = n-i-1 and it will
keep on swapping till i>=n/2
*/
void reverseArrayUsingOneParameter(int arr[],int i,int n){
    if(i>=n/2){
        return;
    }
    swap(arr,i,n-i-1);
    reverseArrayUsingOneParameter(arr,i+1,n);
}

int main() {
	// your code goes here
    int n;
    cin >> n;
    int arr[n];
    for(int i=0;i<n;i++){
        cin >> arr[i];
    }
    reverseArray(arr,0,n-1);
    for(auto i : arr){
        cout << i << " ";
    }
    cout << endl;
    reverseArrayUsingOneParameter(arr,0,n);
    for(auto i : arr){
        cout << i << " ";
    }
	return 0;
}
