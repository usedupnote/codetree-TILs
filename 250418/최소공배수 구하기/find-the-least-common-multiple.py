n, m = map(int, input().split())
cnt = n

while True :
    if cnt % n == 0 and cnt % m == 0:
        print cnt
        break
    
    cnt+=1