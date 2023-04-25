# cook your dish here
#Check if a string is palindrome using Recursion


def checkPalindrome(s,i):
    if(i>=len(s)/2):
        return True;
    if(s[i]!=s[len(s)-i-1]):
        return False;
    return checkPalindrome(s,i+1)
    
s = input()
ans = checkPalindrome(s,0)
if(ans):
    print("palindrome")
else:
    print("not palindrome")
