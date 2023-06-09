t = int(input())                # 입력받는 횟수

for i in range(t):              # 층(k)와 호(n)을 입력
    k = int(input())
    n = int(input())

    num =[]                     # 0층에서 호수별 사람수를 리스트로 생성
    for i in range(1, n+1):
        num.append(i)

    for j in range(k):          # 층수만큼 반복
        for x in range(1, n):   # 호수만큼 반복(1부터 시작)
            num[x] += num[x - 1]# 1부터 시작하는 인덱스 범위를 고려하여 j-1
                                # 주어진 층 수까지 사람 수를 호수까지 더해주고 
                                # 0층의 사람 수 초기화
    print(num[-1])              # 리스트의 마지막을 출력
                                # 0층 사람 수가 K층 사람 수로 바뀌게 되고 
                                # K층의 N호의 숫자가 제일 끝에 저장되니 해당 숫자 출력

# 0층의 사람 수가 고정이므로 0층을 이용하여 사람 수를 구한다.
# 0층부터 시작해서 원하는 층 수까지 값을 규칙에 따라 더해준다.