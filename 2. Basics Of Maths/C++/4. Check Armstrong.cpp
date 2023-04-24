/*
Check if a number is Armstrong or not.
371 = 3^3 + 7^3 + 1^3
1634 = 1^4 + 6^4 + 3^4 + 4^4
*/

#include <bits/stdc++.h>
using namespace std;

int cntDigits(int n){
	int count = 0;
	while(n>0){
		count++;
		n = n/10;
	}
	return count;
}

int main() {
	// your code goes here
    int n;
	cin >> n;
	int m = n,s = 0;
	int count = cntDigits(n);
	while (n > 0)
	{
		int r = n%10;
		s = s + pow(r,count);
		n = n/10;
	}
	if(m==s){
		cout << "n = " << m << " is an Armstrong number";
	}
	else{
			cout << "n = " << m << " is not an Armstrong number";
	}
	return 0;
}
