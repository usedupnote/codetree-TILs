N, M = map(int,input().split())

m = []
for _ in range(N):
    m.append(list(map(int, input().split())))

for i in range(N):
    compare = list(map(int, input().split()))
    for j in range(M):
        if m[i][j] == compare[j]:
            m[i][j] = 0
        else :
            m[i][j] = 1
        

for i in range(N):
    print(*m[i])