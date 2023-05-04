/*
Recursive Insertion Sort
*/

#include <bits/stdc++.h>
using namespace std;

void swap(int arr[],int i,int j){
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
}

//Function to sort an array using recursive insertion sort algorithm.
void recursiveInsertionSort(int arr[], int i, int n)
{
    if(i==n){
        return;
    }
    int j = i;
    while(j>0 && arr[j-1]>arr[j]){
        swap(arr,j,j-1);
        j--;
    }
  
    recursiveInsertionSort(arr,i+1,n);
}

int main() {
	// your code goes here
    int n;
    cin >> n;
    int arr[n];
    for(int i=0;i<n;i++){
        cin >> arr[i];
    }
    recursiveInsertionSort(arr,1,n);
    for(int i=0;i<n;i++){
        cout << arr[i] << " "; 
    }
	return 0;
}
