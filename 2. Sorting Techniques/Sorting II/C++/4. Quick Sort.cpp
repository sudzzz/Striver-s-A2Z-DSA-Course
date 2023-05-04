/*
Quick Sort
*/

#include <bits/stdc++.h>
using namespace std;

int partition (int arr[], int low, int high)
{
   // Your code here
    int pivot = arr[low];
    int i = low;
    int j = high;

    while (i < j) {
        while (arr[i] <= pivot && i <high) {
            i++;
        }

        while (arr[j] > pivot && j >low) {
            j--;
        }
        if (i < j) swap(arr[i], arr[j]);
    }
    swap(arr[low], arr[j]);
    return j;
}

//Function to sort an array using quick sort algorithm.
void quickSort(int arr[], int low, int high)
{
    // code here
    if(low<high){
        int partition_index = partition(arr,low,high);
        quickSort(arr,low,partition_index-1);
        quickSort(arr,partition_index+1,high);
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
    quickSort(arr,0,n-1);
    for(int i=0;i<n;i++){
        cout << arr[i] << " "; 
    }
	return 0;
}
