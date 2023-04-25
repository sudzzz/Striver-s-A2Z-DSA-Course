#Check Palindrome

def checkPalindrome(n):
    revNum = 0
    originalNum = n
    while(n>0):
        last_digit = n%10;
        revNum = revNum*10 + last_digit;
        n //= 10
    if(originalNum==revNum):
        print ("Palindrome")
    else:
        print ("Not Palindrome")
    
n = int(input())
checkPalindrome(n)
