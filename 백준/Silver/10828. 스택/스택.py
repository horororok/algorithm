import sys
input = sys.stdin.readline

n = int(input())

result = []
for i in range(n):
    cmd = input().split()
    stn = cmd[0]
    if stn == "push":
        result.append(cmd[1])
    elif stn == "pop":
        if len(result) == 0:
            print(-1)
        else:
            print(result.pop())
    elif stn == "size":
        print(len(result))
    elif stn == "empty":
        if len(result) == 0:
            print(1)
        else:
            print(0)
    else:
        if len(result) == 0:
            print(-1)
        else:
            print(result[-1])