/*
Check if a given number is prime or not
*/

#include <bits/stdc++.h>
using namespace std;

void checkPrime(int n){
    int count = 0;
    for(int i=1;i*i<=n;i++){
        if(n%i==0){
            count++;
        }
    }
    if(count==1){
        cout << "Number " << n << " is prime";
    } else {
        cout << "Number " << n << " is not prime";
    }
}

int main() {
	// your code goes here
    int n;
	cin >> n;
	checkPrime(n);
	return 0;
}
