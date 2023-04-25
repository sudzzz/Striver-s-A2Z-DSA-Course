# cook your dish here
#Check if a given number is prime or not


def checkPrime(n):
    count = 0
    i=1
    while(i*i<=n):
        if(n%i==0):
            count = count+1
        i = i+1
    if(count == 1):
        print("Number is prime")
    else:
        print("Number is not prime")

n = int(input())
checkPrime(n)