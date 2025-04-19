n = int(input())

def isCal(n) :
    if n % 2 != 0:
        return "No"
    
    if ((n%10) + (n//10)) % 5 != 0:
        return "No"
    return "Yes"

print(isCal(n))