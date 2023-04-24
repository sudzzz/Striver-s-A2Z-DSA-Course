# cook your dish here
#Print all divisors of a given number


def printDivisors(n):
    divisors = []
    i=1
    while(i*i<=n):
        if(n%i==0):
            divisors.append(i)
            if(n/i!=i):
                divisors.append(n//i)
        i = i+1
    divisors.sort()
    for div in divisors:
        print(div, end=" ")


n = int(input())
printDivisors(n)