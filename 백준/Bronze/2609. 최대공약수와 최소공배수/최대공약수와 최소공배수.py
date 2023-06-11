a, b = map(int, input().split())

numList = []

for i in range(1, max(a, b) + 1):       #1부터 a, b 중 큰 값까지의 범위에서
    if a % i == 0 and b % i == 0:       #a와 b가 모두 나누어 떨어지는 경우
        numList.append(i)               #numList 리스트에 추가
print(max(numList))                     #numList 리스트에서 가장 큰값(최대공약수) 출력
print((a // max(numList)) * (b // max(numList)) * max(numList))
#최대 공약수는 a/ 최대공약수 * b/최대공약수 * 최대공약수