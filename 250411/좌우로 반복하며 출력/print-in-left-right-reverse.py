N = int(input())
num = []
for i in range(N):
    num.append(i+1)

for i in range(N):
    if i % 2 == 0:
        print(*num, sep="")
    else:
        print(*num, sep="")
    num.reverse()