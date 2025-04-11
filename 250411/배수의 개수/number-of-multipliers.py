three = 0
five = 0

for _ in range(10):
    n = int(input())
    if n % 3 == 0:
        three += 1
    if n % 5 == 0:
        five += 1

print(three, five)