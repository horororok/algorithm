import sys
input = sys.stdin.readline

k = int(input())


List = []
for i in range(k):
    num = int(input().strip())

    if num == 0:
        List.pop()
    else:
        List.append(num)
print(sum(List))

#for문 내에서 입력을 받아주는 것 까먹지 말자
