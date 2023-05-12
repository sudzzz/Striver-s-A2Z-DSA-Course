/*
Check if array is sorted or not
*/

#include <bits/stdc++.h>
using namespace std;


int checkIsSorted(int arr[],int n){
    for(int i=1;i<n;i++){
        if(arr[i-1]<=arr[i]){
            continue;
        }else{
            return 0;
        }
    }
    return 1;
}

int main() {
	// your code goes here
    int n;
    cin >> n;
    int arr[n];
    for(int i=0;i<n;i++){
        cin >> arr[i];
    }
    int isSorted = checkIsSorted(arr,n);
    if(isSorted==1){
        cout << "Sorted";
    }else{
        cout << "Not Sorted";
    }
	return 0;
}
