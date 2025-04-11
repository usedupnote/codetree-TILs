result = 0
for i in range(4): 
    nums = list(map(int, input().split()))

    for num in nums:
        if num%5 == 0:
            result+=1
print(result)