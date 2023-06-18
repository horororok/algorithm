import sys
from collections import deque

n = int(sys.stdin.readline())

deq = deque()                   #덱 : 큐 선언
for i in range(n):
    deq.append(i + 1)

while len(deq) > 1:
    deq.popleft()               #첫 번째 값을 반환하고 제거
    deq.append(deq.popleft())   #제일 끝에 반환된 첫 번째 값 추가

print(deq.popleft())                #마지막에 남은 값 반환

#큐 의 형식 이해