n, m = map(int, input().split())             #카드 개수n와 합 한도m
cardNum = list(map(int, input().split()))    #카드에 쓰여있는 수

result = 0

for i in range(n):                  #i는 1, n-1까지 범위
    for j in range(i + 1, n):       #j는 i + 1, n-1 까지 범위
        for k in range(j + 1, n):   #k는 j + 1, n-1 까지 범위
            cardSum = cardNum[i] +cardNum[j] +cardNum[k]    #카드합을 구한다
            if cardSum <= m:        #위에서 구한 카드 합이 m보다 작거나 같은 경우
                result = max(result, cardSum) #result 변수는 result와 합 중 가장 큰 값
print(result)