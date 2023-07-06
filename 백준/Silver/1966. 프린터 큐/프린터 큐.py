



a = int(input())                                #테스트 케이스 수

arr = []
for _ in range(a):                              
    n, m = map(int, input().split())
    priority = list(map(int, input().split()))  # n개 문서의 중요도
    index = [i for i in range(n)]               #n개 문서의 기존 순서 저장

    cnt = 0                                     # 몇 번째로 인쇄할지 카운트하는 변수
    while True:
        if priority[0] == max(priority):        #현재 문서가 중요도가 제일 높다면
            cnt += 1                            #몇 번째로 출력 되는지 카운드
            if index[0] == m:                   #궁금한 문서인지 확인
                print(cnt)
                break
            else:                               #궁금한 문서가 아니라면 리스트에서 탈출
                del priority[0]
                del index[0]
        else:                                #나머지 문서들 중 현재 문서보다 중요도가 높은 문서가
            priority.append(priority[0])     #하나라도 있다면 이 문서를 인쇄하지 않고 큐의 가장 뒤에 재배치
            del priority[0]
            index.append(index[0])
            del index[0]