m1 = []
for _ in range(3):
    m1.append(list(map(int, input().split())))

input()

m2 = []
for _ in range(3):
    m2.append(list(map(int, input().split())))

for i in range(3):
    for j in range(3):
        print(m1[i][j] * m2[i][j], end=" ")
    print()