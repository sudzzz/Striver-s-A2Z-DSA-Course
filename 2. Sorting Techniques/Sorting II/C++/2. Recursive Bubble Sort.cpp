/*
Recursive Bubble Sort
*/

#include <bits/stdc++.h>
using namespace std;

void swap(int arr[],int i,int j){
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
}

//Function to sort an array using recursive bubble sort algorithm.
void recursiveBubbleSort(int arr[], int n)
{
    if(n==1){
        return;
    }
    for(int j=0;j<n-1;j++){
        if(arr[j]>arr[j+1]){
            swap(arr,j,j+1);
        }
    }
    recursiveBubbleSort(arr,n-1);
}

int main() {
	// your code goes here
    int n;
    cin >> n;
    int arr[n];
    for(int i=0;i<n;i++){
        cin >> arr[i];
    }
    recursiveBubbleSort(arr,n);
    for(int i=0;i<n;i++){
        cout << arr[i] << " "; 
    }
	return 0;
}
