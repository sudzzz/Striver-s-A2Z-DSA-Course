/*
reverse a number
*/

#include <bits/stdc++.h>
using namespace std;

int reverseNumber(int n) {
    // Write your code here.
    if(n<10)
        return n;
    int revNum = 0;
    while(n>0){
        int last_digit = n%10;
        revNum = revNum*10+last_digit;
        n/=10;
    }
    return revNum;
}


int main() {
	// your code goes here
	int n;
	cin >> n;
	int ans = reverseNumber(n);
	cout << ans;
	return 0;
}
