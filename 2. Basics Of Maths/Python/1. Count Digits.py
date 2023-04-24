#Count digits in a number

def countDigits(n):
    count = 0
    while(n!=0):
        n //= 10
        count += 1

    return count
n = int(input())
ans = countDigits(n)
print(ans)