# cook your dish here
#Find highest and lowest frequency of array elements using hashing


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
max_key = 0
min_key = 0
max_value = -999999
min_value = 999999
for key in mp:
    print(key,mp[key])
    if(mp[key]>max_value):
        max_value = mp[key]
        max_key = key
    if(mp[key]<min_value):
        min_value = mp[key]
        min_key = key

print("Mximum Value ",max_key,max_value)
print("Minimum Value ",min_key,min_value)

q = int(input())
while(q>0):
    number = int(input())
    if number in mp:
        print(number,mp[number])
    else:
        print(number,0)
    q = q-1