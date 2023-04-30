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

void insertionSort(int arr[],int n){
    for(int i=0;i<n;i++){
        int j = i;
        while(j>0 && arr[j-1]>arr[j]){
            swap(arr,j-1,j);
            j--;
        }
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
    insertionSort(arr,n);
    for(int i=0;i<n;i++){
        cout << arr[i] << " "; 
    }
	return 0;
}
