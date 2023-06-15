n, k = map(int, input().split())

Ind = 0
arr = list(range(1, n + 1))
result = []

while len(arr) != 0:
    Ind += (k - 1)
    Ind = Ind % len(arr)
    result.append(arr.pop(Ind))

print("<", end = "")
for i in range(n -1):
    print(result[i], end = ", ")
print(result[n - 1], end = "")
print(">", end = "")

