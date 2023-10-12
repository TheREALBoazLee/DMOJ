a = int(input())
b = int(input())
c = int(input())

for x in range(3):
    if a > b:
        b = a
        
    if b > c:
        c = b

    if c > a:
        a = c

    
    elif a < b < c:
        print (a, b, c)
        
