A, B = map(int ,input().split())

result = 0

for i in range(A, B+1) :
    result += (i if i %  2 == 0 else 0)

print(result)