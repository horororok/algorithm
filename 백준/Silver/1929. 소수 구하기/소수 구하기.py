import sys
input = sys.stdin.readline

m, n = map(int, input().rstrip().split())

for i in range(m, n+1):
    if i == 1:
        continue
    for j in range(2, int(i ** 0.5) + 1):
        if i % j == 0:
            break
    else:
        print(i)

# 1 은 소수가 아니므로 제외
# 반복문을 돌려준다. 범위는 2부터 int( i ** 0.5) + 1까지
#특정 수의 제곱근을 구해서 그 제곱근까지의 약수를 구하면
#  해당 약수를 포함하는 수를 모두 제거할 수 있다.(소수가 아니므로)
# i가 j로 나누어 떨어지면 약수가 존재하므로 소수가 아니다. 
# ->해당 제곱근(j) 이상의 숫자에 대해 더이상 검사할 필요가 없으므로 break
# i가 1이 아니라면 출력