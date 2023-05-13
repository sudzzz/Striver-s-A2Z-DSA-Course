/*
Left rotate elements of array by d places
*/

#include <bits/stdc++.h>
using namespace std;


//TC - O(n+d), SC - O(d)
void leftRotateArray(int arr[],int n,int d){
    int temp[d];
    for(int i=0;i<d;i++){
        temp[i] = arr[i];
    }

    for(int i=d;i<n;i++){
        arr[i-d] = arr[i];
    }

    for(int i=n-d;i<n;i++){
        arr[i] = temp[i-(n-d)];
    }
}

//TC - O(2n), SC - O(1)
void leftRotateArrayOptimal(int arr[],int n,int d){
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
    leftRotateArrayOptimal(arr,n,d%n);
    for(int i=0;i<n;i++){
        cout << arr[i] << " ";
    }
    return 0;
}