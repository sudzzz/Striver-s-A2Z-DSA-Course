/*
Print linearly from 1 to n using Recursion
*/

#include <bits/stdc++.h>
using namespace std;

void printNum(int n){
    if(n==0){
        return;
    }
    printNum(n-1);
    cout << n << endl;
}

int main() {
	// your code goes here
    int n;
    cin >> n;
    printNum(n);
	return 0;
}
