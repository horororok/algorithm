from collections import deque

import sys
input = sys.stdin.readline

n = int(input())
deq = deque()
for i in range(n):
    cmd = input().split()
    stn = cmd[0]
    if len(cmd) > 1:
        if stn == "push_front":
            deq.appendleft(cmd[1])
        else:
            deq.append(cmd[1])
    elif stn == "pop_front":
        if len(deq) == 0:
            print(-1)
        else:        
            print(deq.popleft())
    elif stn == "pop_back":
        if len (deq) == 0:
            print(-1)
        else:
            print(deq.pop())
    elif stn == "size":
        print(len(deq))
    elif stn == "empty":
        if len(deq) == 0:
            print(1)
        else:
            print(0)
    elif stn == "front":
        if len(deq) == 0:
            print(-1)
        else:
            print(deq[0])
    else:
        if len(deq) == 0:
            print(-1)
        else:
            print(deq[-1])


