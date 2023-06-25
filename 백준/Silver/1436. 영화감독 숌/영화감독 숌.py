N = int(input())

li = []             # 빈 리스트 추가
n = 0               # 숫자 0부터
while len(li) < N:      # 리스트의 길이가 입력값보다 작을 때 반복
    if n % 10 != 6:                 # n을 10으로 나누었을 때 나머지가 6이 아니면
        li.append(n * 1000 + 666)   # 리스트에 n * 1000 + 666 값 추가
# 이제부터 n을 10으로 나누었을 때 나머지가 6인 경우
    elif (n // 10) % 100 == 66:     # n을 10으로 나눈것 을 100으로 나눈 나머지가 66이면
        for k in range(1000):       # k는 0 ~ 999
            li.append(n * 1000 + k) # 리스트에 n * 1000 + k 값 추가

    elif (n // 10) % 10 == 6:       # n을 10으로 나눈것 을 10으로 나눈 나머지가 6이면
        for j in range (100):       # j는 0 ~ 99
            li.append(n * 1000 + 600 + j)   # 리스트에 n * 1000 + 600 + j

    else:                           # 나머지의 경우
        for i in range (10):                # i는 0 ~ 9
            li.append(n * 1000 + 660 + i)   # 리스트에 n * 1000 + 660 + i 값 추가

    n += 1              # 리스트의 길이가 입력값보다 작을 때 n에 1을 더한다

print (li[N - 1])           # 리스트의 입력값 - 1 번째 인덱스 값 출력