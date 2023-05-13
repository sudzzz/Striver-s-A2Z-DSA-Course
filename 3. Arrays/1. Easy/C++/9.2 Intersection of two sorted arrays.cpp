/*
Find intersection of two sorted arrays
*/

#include <bits/stdc++.h>
using namespace std;


vector<int> intersectionOfSortedArraysBruteForce(int a[], int n1, int b[],int n2) {
    // Write your code here
    vector<int> ans;
    int visited[n2] = {0};
    for(int i=0;i<n1;i++){
        for(int j=0;j<n2;j++){
            if(a[i]==b[j] && visited[j]==0){
                ans.push_back(a[i]);
                visited[j] = 1;
                break;
            }
            if(b[j]>a[i]){
                break;
            }
        }
    }
    return ans;
}

vector<int> intersectionOfSortedArraysOptimal(int a[], int n1, int b[],int n2){
    int i=0,j=0;
    vector<int> ans;
    while(i<n1 && j<n2){
        if(a[i]<b[j]){
            i++;
        }else if(a[i]==b[j]){
            ans.push_back(a[i]);
            i++;
            j++;
        }else{
            j++;
        }
    }
    return ans;
}


int main() {
    //Write your code here
    int n1;
    cin >> n1;
    int a[n1];
    for(int i=0;i<n1;i++){
        cin >> a[i];
    }
    int n2;
    cin >> n2;
    int b[n2];
    for(int i=0;i<n2;i++){
        cin >> b[i];
    }
    vector<int> ans = intersectionOfSortedArraysOptimal(a,n1,b,n2);
    for(auto it : ans)
        cout << it << " ";
    return 0;
}