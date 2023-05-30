/*
Sort an arrays of 0's 1's and 2's
*/

#include <bits/stdc++.h>
using namespace std;


void sortArrayOf012Brute(int arr[],int n){
    sort(arr,arr+n);
}

void sortArrayOf012Better(int arr[],int n){
    int cnt0=0,cnt1=0,cnt2=0;
    for(int i=0;i<n;i++){
        if(arr[i]==0){
            cnt0++;
        }else if(arr[i]==1){
            cnt1++;
        }else{
            cnt2++;
        }
    }
    for(int i=0;i<cnt0;i++){
        arr[i] = 0;
    }
    for(int i=0;i<cnt1;i++){
        arr[i+cnt0] = 1;
    }
    for(int i=0;i<cnt2;i++){
        arr[i+cnt0+cnt1] = 2;
    }
}
    
//Dutch National Flag Algorithm
void sortArrayOf012Optimal(int arr[],int n){
    int low=0,mid=0,high=n-1;
    while(mid<=high){
        if(arr[mid]==0){
            swap(arr[mid],arr[low]);
            low++;
            mid++;
        }else if(arr[mid]==1){
            mid++;
        }else{
            swap(arr[mid],arr[high]);
            high--;
        }
    }
}
    
    
int main() {
    //Write your code here
    int n;
    cin >> n;
    int arr[n];
    for(int i=0;i<n;i++){
        cin >> arr[i];
    }
    sortArrayOf012Optimal(arr,n);
    for(int i=0;i<n;i++){
        cout << arr[i] << " ";
    }
    return 0;
}