n = int(input())
a = list(map(int, input().split()))
m = int(input())

arr = list(map(int, input().split()))
a.sort()

for i in arr:
    lt, rt = 0, n - 1       #lt는 맨 앞, rt는 맨 뒤
    isExist = False         #찾음 여부

    while lt <= rt:
        mid = (lt + rt) // 2
        if i == a[mid]:
            isExist = True
            print(1)
            break
        elif i > a[mid]:
            lt = mid + 1
        else:
            rt = mid  - 1
    if not isExist:
        print(0)

