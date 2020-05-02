x, y = input().split()

x = int(x)
y = int(y)


if x == y :
    print(x + 1)

else :
    start = min(x, y) + 1
    dif = abs(x-y) + 1
    for i in range(start, start+dif) :
        print(i)
