a = list(range(10))
b = [complex(i, i) for i in range(10)]
c = [i/10 for i in range(10)]

result = a + b + c
print(result)