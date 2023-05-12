/*
Remove duplicate elements from sorted array.
*/

#include <bits/stdc++.h>
using namespace std;


int remove_duplicate(int arr[],int n){
    // code here
    int i = 0;
    for(int j=1;j<n;j++){
        if(arr[j]!=arr[i]){
            arr[i+1] = arr[j];
            i++;
        }
    }
    return i+1;
}

int main() {
	// your code goes here
    int n;
    cin >> n;
    int arr[n];
    for(int i=0;i<n;i++){
        cin >> arr[i];
    }
    int size = remove_duplicate(arr,n);
    for(int i=0;i<size;i++){
        cout << arr[i] << " ";
    }
}
