/*
Check if a string is palindrome using Recursion
*/

#include <bits/stdc++.h>
using namespace std;

bool checkPalindrome(string &s,int i){
    if(i>=s.length()/2){
        return true;
    }
    if(s[i]!=s[s.length()-i-1]){
        return false;
    }
    return checkPalindrome(s,i+1);
}

int main() {
	// your code goes here
    string s;
    cin >> s;
    bool ans = checkPalindrome(s,0);
    if(ans){
        cout << "palindrome";
    }else{
        cout << "not palindrome";
    }
	return 0;
}
