/*
Counting frequencies of array elements using hashing
*/

#include <bits/stdc++.h>
using namespace std;


int main() {
	// your code goes here
    int n;
    cin >> n;
    int arr[n];
    unordered_map<int,int> ump;
    map<int,int> mp;
    for(int i=0;i<n;i++){
        cin >> arr[i];
        ump[arr[i]]++;
        mp[arr[i]]++;
    }
    
    for(auto it : ump){
        cout << it.first << "->" << it.second << endl;
    }
    
    for(auto it : mp){
        cout << it.first << "->" << it.second << endl;
    }
    
    int q;
    cin >> q;
    while(q--){
        int number;
        cin >> number;
        cout << "Map " << number << " " << mp[arr[number]] <<endl;
        cout << "Unordered Map " << number << " " << ump[arr[number]] << endl;
    }
	return 0;
}
