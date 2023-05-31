/*
Majority element in an array
*/

#include <bits/stdc++.h>
using namespace std;


int majorityElementInArrayBrute(int arr[],int n){
    for(int i=0;i<n;i++){
        int cnt = 0;
        for(int j=0;j<n;j++){
            if(arr[j]==arr[i]){
                cnt++;
            }
        }
        if(cnt > (n/2)){
            return arr[i];
        }
    }
    return -1;
}
    
int majorityElementInArrayBetter(int arr[],int n){
    map<int,int> mpp;
    for(int i=0;i<n;i++){
        mpp[arr[i]]++;
    }
    for(auto it : mpp){
        if(it.second > (n/2)){
            return it.first;
        }
    }
    return -1;
}
    
//Moore's Voting Algorithm
int majorityElementInArrayOptimal(int arr[],int n){
    int cnt=0,el=0;
    for(int i=0;i<n;i++){
        if(cnt==0){
            cnt = 1;
            el = arr[i];
        } else if(arr[i] == el){
            cnt++;
        } else{
            cnt--;
        }
    }
    int cnt1 = 0;
    for(int i=0;i<n;i++){
        if(arr[i]==el){
            cnt1++;
        }
    }
    if(cnt1 > (n/2)){
        return el;
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
    int result = majorityElementInArrayOptimal(arr,n);
    cout << result;
    return 0;
}