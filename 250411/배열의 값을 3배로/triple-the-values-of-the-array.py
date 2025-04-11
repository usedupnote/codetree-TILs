m = []
for _ in range(3):
    m.append(list(map(int, input().split())))

for i in range(3):
    for j in range(3):
        print(m[i][j] * 3, end = " ")
    print()