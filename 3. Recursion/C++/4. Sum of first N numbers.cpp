/*
Summation of first N numbers using Recursion
*/

#include <bits/stdc++.h>
using namespace std;

int findSumUsingParameterisedFunction(int n,int s){
    if(n==0){
        return s;
    }
    s += n; 
    return findSumUsingParameterisedFunction(n-1,s);
}

int findSum(int n){
    if(n==0){
        return 0;
    }
    return n+findSum(n-1);
}

int main() {
	// your code goes here
    int n;
    cin >> n;
    int sum1 = findSumUsingParameterisedFunction(n,0);
    int sum2 = findSum(n);
    cout <<"Sum of first N numbers is "<< sum1 << endl;
    cout <<"Sum of first N numbers is "<< sum2 << endl;
	return 0;
}
