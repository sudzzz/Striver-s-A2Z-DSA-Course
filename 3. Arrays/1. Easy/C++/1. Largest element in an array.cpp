/*
Find largest element in an array
*/

#include <bits/stdc++.h>
using namespace std;


int findLargestElement(int arr[],int n)
{
    int largest = arr[0];
    for(int i=0;i<n;i++){
        if(arr[i]>largest){
            largest = arr[i];
        }
    }
    return largest;
}

int main() {
	// your code goes here
    int n;
    cin >> n;
    int arr[n];
    for(int i=0;i<n;i++){
        cin >> arr[i];
    }
    int largest = findLargestElement(arr,n);
    cout << largest;
	return 0;
}
