s = list(input().split())

if len(s[0]) == len(s[1]) :
    print("same")
elif len(s[0]) > len(s[1]) :
    print(s[0], len(s[0]))
else :
    print(s[1], len(s[1]))
