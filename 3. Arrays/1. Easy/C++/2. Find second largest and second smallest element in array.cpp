/*
Find second largest and second smallest element in an array
*/

#include <bits/stdc++.h>
using namespace std;


int findSecondLargest(int arr[],int n){
    int largest = arr[0],secondLargest = INT_MIN;
    for(int i=1;i<n;i++){
        if(arr[i]>largest){
            secondLargest = largest;
            largest = arr[i];
        }else if (arr[i] < largest && arr[i] > secondLargest){
            secondLargest = arr[i];
        }
    }
    return secondLargest;
}


int findSecondSmallest(int arr[],int n){
    int smallest = arr[0],secondSmallest = INT_MAX;
    for(int i=1;i<n;i++){
        if(arr[i]<smallest){
            secondSmallest = smallest;
            smallest = arr[i];
        } else if (arr[i] != smallest && arr[i]<secondSmallest){
            secondSmallest = arr[i];
        }
    }
    return secondSmallest;
}


int main() {
	// your code goes here
    int n;
    cin >> n;
    int arr[n];
    for(int i=0;i<n;i++){
        cin >> arr[i];
    }
    int secondLargest = findSecondLargest(arr,n);
    int secondSmallest = findSecondSmallest(arr,n);
    cout << secondLargest << " " << secondSmallest;
	return 0;
}
