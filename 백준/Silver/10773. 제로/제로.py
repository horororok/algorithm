

k = int(input())


List = []
for i in range(k):
    num = int(input())

    if num == 0:
        List.pop()
    else:
        List.append(num)
print(sum(List))
