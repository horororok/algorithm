import sys                      #예시가 백만개라 사용

input = sys.stdin.readline

n = int(input())
lis = []

for i in range(n):              #인풋 값을 리스트로 만들어준다
    lis.append(int(input()))

for i in sorted(lis):          #sorted 사용하여 오름차순(원배열 값에 영향 X)
    print(i)
