N = int(input())

for _ in range(N):
    result = 0
    A, B = map(int, input().split())
    for i in range(A, B+1):
        if i % 2 == 0:
            result += i
    print(result)