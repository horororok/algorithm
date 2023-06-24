n = int(input())

num = 666
cnt = 0
while  True:
    if '666' in str(num):   # 666이 num 안에 있으면 
        cnt += 1            # cnt 한 번 더하기 (갯수 세줌)
    if cnt == n:            # cnt가 n과 같다면 (갯수가 입력과 같다면)
        print(num)          # num 출력
        break               # 멈춰
    num += 1                # 위 조건들에 부합하지 않으면 num에 + 1