N = int(input())

for i in range(1, N+1):
    for j in range(1, N+1):
        if j != 1 :
            print(",", end=" ")
        print(i, "*", j, "=", end=" ")
        print(i*j, end="")
    print()