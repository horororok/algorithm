a = int(input())

for i in range(a):
    h, w, n = map(int, input().split())
    floor = n % h                       #방호수는 n번째 손님을 높이h로 나는 몫 + 1
    roomNum = n // h + 1                #층 수는 n번째 손님을 높이h로 나눈 나머지

    if floor == 0:                      #높이가 맞아 떨어질 경우 예외사항 발생
        floor = h                       #층 수가 0이라면 높이h로 설정
        roomNum -= 1                    #방호수를 하나 줄여준다

    print(floor * 100 + roomNum)        #층수 * 100 + 방호수 == 방번호

#문제가 길어도 차분하게 규칙을 먼저 찾아보자
