import sys
from collections import deque
input = sys.stdin.readline

n = int(input())

q = deque()
for i in range(n):
    cmd = input().split()
    stN = cmd[0]
    if stN == "push":
        q.append(cmd[1])

    elif stN == "pop":
        if len(q) == 0:
            print(-1)
        else:
            print(q.popleft())

    elif stN == "size":
        print(len(q))

    elif stN == "empty":
        if len(q) == 0:
            print(1)
        else:
            print(0)

    elif stN == "front":
        if len(q) == 0:
            print(-1)
        else:
            print(q[0])

    else:
        if len(q) == 0:
            print(-1)
        else:
            print(q[-1])