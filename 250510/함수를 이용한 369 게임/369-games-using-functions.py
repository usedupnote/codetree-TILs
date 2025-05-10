a, b = map(int, input().split())

def tsn(a, b):
    cnt = 0
    for i in range(a, b+1) :
        
        if i % 3 == 0:
            cnt+=1
        elif any(d in ["3", "6", "9"] for d in list(str(i))):
            cnt+=1
    return cnt
    
print(tsn(a,b))