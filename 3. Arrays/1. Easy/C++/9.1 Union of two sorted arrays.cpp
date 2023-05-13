/*
Find union of two sorted arrays
*/

#include <bits/stdc++.h>
using namespace std;


vector<int> unionOfSortedArraysBruteForce(int a[], int n1, int b[],int n2) {
    // Write your code here
    set<int> st;
    for(int i=0;i<n1;i++){
        st.insert(a[i]);
    }
    for(int i=0;i<n2;i++){
        st.insert(b[i]);
    }
    vector<int> ans;
    for(auto it: st){
        ans.push_back(it);
    }
    return ans;
}

vector<int> unionOfSortedArraysOptimal(int a[], int n1, int b[],int n2){
    int i=0,j=0;
    vector<int> ans;
    while(i<n1 && j<n2){
        if(a[i]<=b[j]){
            if(ans.size()==0 || ans.back()!=a[i]){
                ans.push_back(a[i]);
            }
            i++;
        }else{
            if(ans.size()==0 || ans.back()!=b[j]){
                ans.push_back(b[j]);
            }
            j++;
        }
    }
    while(i<n1){
        if(ans.size()==0 || ans.back()!=a[i]){
            ans.push_back(a[i]);
        }
        i++;
    }
    while(j<n2){
        if(ans.size()==0 || ans.back()!=b[j]){
            ans.push_back(b[j]);
        }
        j++;
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
    vector<int> ans = unionOfSortedArraysOptimal(a,n1,b,n2);
    for(auto it : ans)
        cout << it << " ";
    return 0;
}