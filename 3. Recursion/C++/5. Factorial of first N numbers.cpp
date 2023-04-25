/*
Factorial of first N numbers using Recursion
*/

#include <bits/stdc++.h>
using namespace std;

int findFactorial(int n){
    if(n==1 || n==0){
        return 1;
    }
    return n*findFactorial(n-1);
}

int main() {
	// your code goes here
    int n;
    cin >> n;
    int factorial = findFactorial(n);
    cout <<"Factorial of first N numbers is "<< factorial << endl;
	return 0;
}
