N = int(input())
nums = list(map(int, input().split()))

print(*list(i*i for i in nums))