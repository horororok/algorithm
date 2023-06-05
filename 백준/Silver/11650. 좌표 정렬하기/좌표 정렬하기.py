import sys
input = sys.stdin.readline

#좌표가 주어질때 x를 먼저 정렬하고 y를 정렬해 준다.

n = int(input())
arr = []                            #주어진 좌표를 리스트로 만들어 준다.

for i in range(n):                  #x, y 좌표를 리스트에 추가
    a, b = map(int, input().split())
    arr.append([a, b])
                                    #이중 리스트 형태의 출력 형태를 바꿔줘야 함.

arr.sort()                          # 정렬

for i in range(n):
    print(arr[i][0], arr[i][1])     #리스트 원소(x좌표, y좌표)들을 뽑아내서 출력

# 1. x, y 좌표를 담을 빈 리스트 선언
# 2. x, y 좌표를 입력 후 리스트에 추가
# 3. 정렬
# 4. 인덱싱해서 각 원소들을 출력