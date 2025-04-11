s = ["apple", "banana", "grape", "blueberry", "orange"]

c = input()
cnt = 0

for ss in s:
    if c in ss[2:4]:
        print(ss)
        cnt+= 1

print(cnt)
