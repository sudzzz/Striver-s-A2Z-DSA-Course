/*
Left rotate elements of array by 1 place
*/

#include <bits/stdc++.h>
using namespace std;


void left_rotate_by_one(int arr[],int n){
    // code here
    int firstElement = arr[0];
    for(int i=0;i<n-1;i++){
        arr[i] = arr[i+1];
    }
    arr[n-1] = firstElement;
}

int main() {
	// your code goes here
    int n;
    cin >> n;
    int arr[n];
    for(int i=0;i<n;i++){
        cin >> arr[i];
    }
    left_rotate_by_one(arr,n);
    for(int i=0;i<n;i++){
        cout << arr[i] << " ";
    }
}
