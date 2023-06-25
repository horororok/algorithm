n = int(input())

result = 1
cnt = 0

for i in range(1, n + 1):
    result *= i                         #팩토리얼 계산

nlist = list(map(int, str(result)))     #숫자의 리스트화

for i in range(len(nlist) -1 , -1, -1): #리스트 거꾸로 읽기
    if nlist[i] == 0:                   #0이면 카운트 + 1
        cnt += 1
    else:                               #아니면 멈춰
        break

print(cnt)