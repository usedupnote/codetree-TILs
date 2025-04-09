nums = list(map(int, input().split()))

for i in range(2, 10):
    nums.append((nums[i-1] + nums[i-2]) % 10)

print(*nums)