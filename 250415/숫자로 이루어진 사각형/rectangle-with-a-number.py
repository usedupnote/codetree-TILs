n = int(input())
i = 0
for _ in range(n):
    for _ in range(n):
        print(i+1, end=" ")
        i = (i + 1) % 9
    print()