/*
Find maximum consecutive One's in an array
*/

#include <bits/stdc++.h>
using namespace std;


int findMaximumConsecutiveOnes(int arr[],int n){
    int maximum = 0,counter = 0;
    for(int i=0;i<n;i++){
        if(arr[i]==1){
            counter++;
            maximum = max(maximum,counter);
        }else {
            counter = 0;
        }
    }
    return maximum;
}

int main() {
    //Write your code here
    int n;
    cin >> n;
    int arr[n];
    for(int i=0;i<n;i++){
        cin >> arr[i];
    }
    int maximumConsecutiveOnes = findMaximumConsecutiveOnes(arr,n);
    cout << maximumConsecutiveOnes;
    return 0;
}