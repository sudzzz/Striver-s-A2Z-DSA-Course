/*
Longest Subarray With Sum K (Poitivies and Zero)
*/

#include <bits/stdc++.h>
using namespace std;


int longestSubArrayWithSumKContainingPositivesBrute(int arr[],int n,int k){
    int maxLen = 0;
    for(int i =0;i<n;i++){
        int sum = 0;
        for(int j=i;j<n;j++){
            sum = sum + arr[j];
            if(sum == k){
                maxLen = max(maxLen,j-i+1);
            }
        }
    }
    return maxLen;
}

int longestSubArrayWithSumKWithArrayContainingPositivesBetter(int arr[],int n,int k){
    int maxLen = 0;
    map<int,int> preSumMap;
    int sum = 0;
    for(int i=0;i<n;i++){
        sum = sum + arr[i];
        if(sum == k){
            maxLen = max(maxLen,i+1);
        }
        int rem = sum - k;
        if(preSumMap.find(rem)!=preSumMap.end()){
            int len = i - preSumMap[rem];
            maxLen = max(maxLen,len);
        }
        if(preSumMap.find(sum)==preSumMap.end()){
            preSumMap[sum] = i;
        }
    }
    return maxLen;
}
    
int longestSubArrayWithSumKWithArrayContainingPositivesOptimal(int arr[],int n,int k){
    int left = 0,right = 0;
    int maxLen = 0;
    int sum = arr[0];
    while(right < n){
        while(left <= right && sum > k){
            sum = sum - arr[left];
            left++;
        }
        if(sum == k){
            maxLen = max(maxLen,right-left+1);
        }
        right++;
        if(right < n){
            sum = sum + arr[right];
        }
    }
    return maxLen;
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
    int maxLen = longestSubArrayWithSumKWithArrayContainingPositivesOptimal(arr,n,k);
    cout << maxLen;
    return 0;
}