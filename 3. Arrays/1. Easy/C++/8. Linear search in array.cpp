/*
Linear search in an array
*/

#include <bits/stdc++.h>
using namespace std;


 int linearSearch(int arr[],int n,int num){
    for(int i=0;i<n;i++){
        if(arr[i]==num){
            return i;
        }
    }
    return -1;
}

int main() {
    //Write your code here
    int n;
    cin >> n;
    int arr[n];
    for(int i=0;i<n;i++){
        cin >> arr[i];
    }
    int num;
    cin >> num;
    int ans = linearSearch(arr,n,num);
    cout << ans;
    return 0;
}