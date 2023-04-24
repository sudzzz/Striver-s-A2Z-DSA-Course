/*
Print all divisors of a given number
*/

#include <bits/stdc++.h>
using namespace std;

void printDivisors(int n){
    vector<int> list;
    //O(sqrt(N)) --> N = number
    for(int i=1;i*i<=n;i++){
        if(n%i==0){
            list.push_back(i);
            if(n/i!=i){
                list.push_back(n/i);
            }
        }

    }
    //O(nlogn) --> n = number of divisors
    sort(list.begin(),list.end());
    //O(n) -->  n = number of divisors
    for(auto l : list){
        cout << l << " ";
    }
}

int main() {
	// your code goes here
    int n;
	cin >> n;
	printDivisors(n); //Total time complexity = O(N) + O(nlogn) + O(n)
	return 0;
}
