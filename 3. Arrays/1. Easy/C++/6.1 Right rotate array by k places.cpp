/*
Right rotate elements of array by d places -- It is equivalent to left rotation of array by n-d places.
*/

#include <bits/stdc++.h>
using namespace std;


//TC - O(2n), SC - O(1)
void rightRotateArrayOptimal(int arr[],int n,int d){
    d = n-d;
    reverse(arr,arr+d); // O(d)
    reverse(arr+d,arr+n); // O(n-d)
    reverse(arr,arr+n); // O(n)
}

int main() {
    //Write your code here
    int n;
    cin >> n;
    int arr[n];
    for(int i=0;i<n;i++){
        cin >> arr[i];
    }
    int d;
    cin >> d;
    rightRotateArrayOptimal(arr,n,d%n);
    for(int i=0;i<n;i++){
        cout << arr[i] << " ";
    }
    return 0;
}