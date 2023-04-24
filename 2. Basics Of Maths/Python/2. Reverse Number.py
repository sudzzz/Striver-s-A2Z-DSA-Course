#reverse a number

def reverseNumber(n):
    revNum = 0
    while(n>0):
        last_digit = n%10;
        revNum = revNum*10 + last_digit;
        n //= 10

    return revNum
n = int(input())
ans = reverseNumber(n)
print(ans)