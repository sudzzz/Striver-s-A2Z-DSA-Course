/*
Two Sum Problem in an array
*/

#include <bits/stdc++.h>
using namespace std;


string twoSumProblemBrute(int arr[],int n,int target){
    for(int i =0;i<n;i++){
        for(int j=i+1;j<n;j++){
            if(arr[i]+arr[j]==target){
                return "Yes";
            }
        }
    }
    return "No";
}

string twoSumProblemBetterWithHashing(int arr[],int n,int target){
    map<int,int> mpp;
    for(int i=0;i<n;i++){
        int rem = target - arr[i];
        if(mpp.find(rem)!=mpp.end()){
            return "Yes";
        }
        mpp[arr[i]] = i;
    }
    return "No";
}

string twoSumProblemOptimalWithTwoPointerApproach(int arr[],int n,int target){
    sort(arr,arr+n);
    int left = 0,right = n-1;
    while(left < right){
        int sum = arr[left] + arr[right];
        if(sum == target){
            return "Yes";
        }
        else if(sum < target){
            left++;
        }
        else{
            right--;
        }
    }
    return "No";
}

int main() {
    //Write your code here
    int n;
    cin >> n;
    int arr[n];
    for(int i=0;i<n;i++){
        cin >> arr[i];
    }
    int k;
    cin >> k;
    string result = twoSumProblemOptimalWithTwoPointerApproach(arr,n,k);
    cout << result;
    return 0;
}