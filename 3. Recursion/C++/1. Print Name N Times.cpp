/*
Print name n times using Recursion
*/

#include <bits/stdc++.h>
using namespace std;

void printName(int n){
    if(n==0){
        return;
    }
    cout << "My Name is Sudhir Daga" << "\n";
    printName(n-1);
}

int main() {
	// your code goes here
    int n;
    cin >> n;
    printName(n);
	return 0;
}
