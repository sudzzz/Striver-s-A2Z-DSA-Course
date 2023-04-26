/*
Find highest and lowest frequency of array elements using hashing
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
    int min_ump=INT_MAX,max_ump=INT_MIN,max_ump_key=0,min_ump_key=0;
    for(auto it : ump){
        cout << it.first << "->" << it.second << endl;
        if(it.second>max_ump){
            max_ump = it.second;
            max_ump_key = it.first;
        }
        if(it.second<min_ump){
            min_ump = it.second;
            min_ump_key = it.first;
        }
    }
    
    cout << "Max frequency " << max_ump_key << " -> " << max_ump << endl;
    cout << "Min frequency " << min_ump_key << " -> " << min_ump << endl;
    
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
