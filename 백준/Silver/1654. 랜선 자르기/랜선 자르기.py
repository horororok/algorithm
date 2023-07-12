import sys

k, n = map(int, input().split())
lan = [int(sys.stdin.readline()) for _ in range(k)]

start, end = 1, max(lan)            #이분탐색 처음과 끝위치 지정

while start <= end:                 #적절한 랜선의 길이를 찾기위해 시작이 끝보다 작거나 같아질때까지 반복
                                    #중간위치는 시작과 끝을 2로 나눈 값으로 정해준다
    mid = (start + end) // 2        #중간 위치
    lines = 0                       #랜선 수
    for i in lan:
        lines += i // mid           #분할된 랜선 수

    if lines >= n:                  #분할된 랜선 개수가 필요한 개수보다 크거나 같다면
        start = mid + 1             #시작위치는 중간위치 +1
    else:                           #아니라면 끝지점이 중간위치 - 1
        end = mid - 1
print(end)