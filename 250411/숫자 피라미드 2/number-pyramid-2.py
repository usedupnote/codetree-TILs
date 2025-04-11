N = int(input())
cnt = 1
che = 1
i = 1

for _ in range(1, N+1):
    for _ in range(cnt):
        print(i, end=" ")
        i += 1
        cnt-=1
    print()
    che+=1
    cnt=che