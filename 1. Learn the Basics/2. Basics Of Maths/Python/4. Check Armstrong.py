# cook your dish here
#Check if a number is Armstrong or not.
#371 = 3^3 + 7^3 + 1^3
#1634 = 1^4 + 6^4 + 3^4 + 4^4


def countDigits(n):
    count = 0
    while(n>0):
        count = count+1
        n //= 10       # // --> it indicates floor division. It truncates the decimal and returns the integer result, while 'normal' division returns the answer with decima
    return count

def checkArmstrong(n):
    s = 0
    count = countDigits(n)
    while(n>0):
        r = n%10
        s = s + pow(r,count)
        n //= 10
    return s

n = int(input())
m = n
s = checkArmstrong(n)

if(s==m):
    print("Armstrong number")
else:
    print("Not an Armstrong number")