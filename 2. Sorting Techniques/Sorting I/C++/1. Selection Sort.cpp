/*
Selection Sort
*/

#include <bits/stdc++.h>
using namespace std;

void swap(int arr[],int i, int j){
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
}

void selectionSort(int arr[],int n){
    for(int i=0;i<n-1;i++){
        int minimum = i;
        for(int j=i;j<n;j++){
            if(arr[j] < arr[minimum]){
                minimum = j;
            }
        }
        swap(arr,i,minimum);
    }
}

int main() {
	// your code goes here
    int n;
    cin >> n;
    int arr[n];
    for(int i=0;i<n;i++){
        cin >> arr[i];
    }
    selectionSort(arr,n);
    for(int i=0;i<n;i++){
        cout << arr[i] << " "; 
    }
	return 0;
}
