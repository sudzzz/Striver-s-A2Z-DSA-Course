/*
HCF of 2 numbers
Eucledian Algorithm --> gcd(a,b) = gcd(a-b,b) ; for a>b

It can be modified to gcd(a,b) = gcd(a%b,b); for a>be

e.g gcd(52,10) = gcd(42,10) = gcd(32,10) = gcd(22,10) = gcd(12,10) = gcd(2,10); for appltying gcd(a,b) = gcd(a-b,b); a>b
is equivalent to gcd(2,10) with gcd(52,10) = gcd(52%10,10) = gcd(2,10)
gcd(10,2) = gcd(10%2,2) = gcd(0,2). Therefore gcd  = 2

Always apply greater%smaller till one of them is 0. If one of them gets 0, the other one is the gcd.

Time complexity = O(log(min(a,b))base Φ)

Whenever there is divisions happening, the number of iterations will be in terms of log. Over here there is
modulo where we are reducing the number by division
*/

#include <bits/stdc++.h>
using namespace std;

int findGCD(int a,int b){
   while(a>0 && b>0){
       if(a>b){
           a = a%b;
       }
       else{
           b = b%a;
       }
   }
   if(a==0)
    return b;
    return a;
}

int main() {
	// your code goes here
    int a,b;
	cin >> a >> b;
	int gcd = findGCD(a,b);
	cout << "GCD of " << a << " and " << b << " is " << gcd;
	return 0;
}
