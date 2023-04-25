/*
Count number of digits in a number
*/

#include <bits/stdc++.h>
using namespace std;

int countNumber(int n) {
    // Write your code here.
    int count = 0;
    while(n>0){
        n = n/10;
        count++;
    }
    return count;
}


int main() {
	// your code goes here
	int n;
	cin >> n;
	int ans = countNumber(n);
	cout << ans;
	return 0;
}
