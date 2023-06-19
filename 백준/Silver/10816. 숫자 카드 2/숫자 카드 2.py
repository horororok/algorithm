import sys
input = sys.stdin.readline

n = int(input())
numCard = sorted(list(map(int, input().split()))) # 갖고 있는 숫자카드의 리스트를 정렬 해줌
m = int(input())
numArr = list(map(int, input().split()))          # 몇 개 가지고 있는지 구해야할 숫자의 리스트

cnt = {}                            #dict 설정  
for i in numCard:                   #갖고 있는 숫자카드의 리스트
    if i in cnt:                    #dict 내에 있으면
        cnt[i] += 1                 #1을 더해준다
    else:                           #없으면
        cnt[i] = 1                  #1

for i in numArr:                    #구해야할 숫자의 리스트
    if i in cnt:                    #dict 내에 있으면
        print(cnt[i], end = " ")    #cnt의 인덱스값(개수)과 공백 출력
    else:                           #없으면
        print(0, end =" ")          #0과 공백 출력

#dict에 개수를 저장해놓고, key에 대한 것이 존재하면 개수를 반환하고 그 외에는 0을 반환하는 방법으로 결과 도출