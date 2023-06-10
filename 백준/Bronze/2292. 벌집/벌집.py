#벌집의 개수가 6의 배수로 증가한다. -> while문 사용
#증가하는 숫자가 입력받은 수에 도달할 때까지만 반복하도록 설정
#반복되는 동안 반복 횟수를 카운트

n = int(input())

start = 1           #벌집의 시작 개수
cnt = 1
while n > start:
    start += 6 *cnt #벌집이 6의 배수만큼 증가한다.
    cnt += 1        #반복문을 반복하는 횟수
print(cnt)