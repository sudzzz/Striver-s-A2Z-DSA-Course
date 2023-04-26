# cook your dish here
#Counting frequencies of array elements using hashing


def frequency(arr,n):
    mp = {}
    for num in arr:
        if num in mp:
            mp[num] += 1
        else:
            mp[num] = 1
    return mp

n = int(input())
arr = list(map(int,input().strip().split()))
mp = frequency(arr,n)
for key in mp:
    print(key,mp[key])

q = int(input())
while(q>0):
    number = int(input())
    if number in mp:
        print(number,mp[number])
    else:
        print(number,0)
    q = q-1