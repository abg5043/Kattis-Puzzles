#Quality-Adjusted Life-Year

numYears = int(input())

sum = 0
i=0
while i < numYears : 
    x,y = input().split()
    sum += float(x)*float(y)
    i += 1

print(sum)
