n = int(input())                        # 총 사람 수

sizeList = []                           #사람 별 몸무게와 키
for i in range(n):
    x, y = map(int, input().split())    #몸무게와 키를 n번 받아 준다
    sizeList.append((x, y))             #사람 별 몸무게와 키 리스트에 추가해 줌

for i in sizeList:                      #i는 사람별 몸무게와 키의 인덱스
    rank = 1                            #등수는 1부터 시작
    for j in sizeList:                  #j는 사람별 몸무게와 키의 인덱스
        if i[0] < j[0] and i[1] < j[1]: #i[0], j[0]은 몸무게, i[1], j[1]은 키
            rank += 1                   #등수에 1씩 더해준다.
    print(rank, end = " ")              #사이에 공백을 위해 end = " " 추가