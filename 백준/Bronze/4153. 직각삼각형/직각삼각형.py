while True:
    a = list(map(int, input().split()))     #리스트 형태로 숫자들을 받아준다
    maxN = max(a)   

    if sum(a) == 0:
        break
    a.remove(maxN)                          # 가장 큰 값은 리스트에서 빼준다
    if a[0] ** 2 + a[1] ** 2 == maxN ** 2:  #가장 큰 값의 제곱과 리스트 안의 숫자들의
        print("right")                      #제곱의 합을 비교
    else:
        print("wrong")

#샘플에서 크기 순서 대로 줬다고 항상 인풋이 크기 순으로 들어올 거라고 오판 말기!