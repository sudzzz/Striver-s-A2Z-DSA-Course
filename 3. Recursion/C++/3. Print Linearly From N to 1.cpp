/*
Print linearly from n to 1 using Recursion
*/

#include <bits/stdc++.h>
using namespace std;

void printNum(int n){
    if(n==0){
        return;
    }
    cout << n << endl;
    printNum(n-1);
}

int main() {
	// your code goes here
    int n;
    cin >> n;
    printNum(n);
	return 0;
}
