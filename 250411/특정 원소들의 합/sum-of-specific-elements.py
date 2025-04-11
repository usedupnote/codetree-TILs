result = 0
for i in range(4):
    m = list(map(int, input().split()))
    for j in range(i+1):
        result += m[j]
print(result)