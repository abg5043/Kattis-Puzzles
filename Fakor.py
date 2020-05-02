import math

inpList = input()
inpArray = inpList.split()
impactFactor = int(inpArray[0]) * (float(inpArray[1])-.99)
impactFactor = math.ceil(impactFactor)

print(impactFactor)
