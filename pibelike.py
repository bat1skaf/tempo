import random
m=0
for n in range(1000):
    x = random.uniform(0, 2)
    y = random.uniform(0, 2)
    if (x-1)**2+(y-1)**2<=1:
        m=m+1 
print('Число Пи be like:',(4*m)/n)

# Число Пи be like: 3.071071071071071
