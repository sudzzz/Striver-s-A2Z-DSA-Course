/*
Nth Fibonaaci number using Recursion
*/

#include <bits/stdc++.h>
using namespace std;

//Time complexity = 2^n
int fib(int n){
    if(n==1 || n==0){
        return n;
    }
    return fib(n-1)+fib(n-2);
}

int main() {
	// your code goes here
    int n;
    cin >> n;
    int ans = fib(n);
    cout << "Nth Fibonaaci number is " << ans;
	return 0;
}
