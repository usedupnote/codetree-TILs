N = int(input())

for i in range(1, N+1):
    for j in range(N):
        if j % 2 == 0:
            print(i, end="")
        else:
            print(N+1 - i, end="")
    print()