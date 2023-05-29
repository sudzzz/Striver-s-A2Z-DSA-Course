/*
Longest Subarray With Sum K (Poitivies and Negatives)
*/

#include <bits/stdc++.h>
using namespace std;


int longestSubArrayWithSumKContainingPositivesAndNegativesBrute(int arr[],int n,int k){
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

int longestSubArrayWithSumKWithArrayContainingPositivesAndNegativesOptimal(int arr[],int n,int k){
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
    int maxLen = longestSubArrayWithSumKWithArrayContainingPositivesAndNegativesOptimal(arr,n,k);
    cout << maxLen;
    return 0;
}