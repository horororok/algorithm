t = int(input())

for i in range(t):
    a = input()
    s = []                                  #리스트로 스택 구현

    for j in range(len(a)):                 #a의 길이 만큼 반복
        s.append(a[j])                      #스택 s에 추가
        if len(s) >= 2:                     #s의 길이가 2보다 클경우
            if s[-2] == "("and s[-1] ==")": #뒤에서 두번째, 맨 뒤 가 ()일경우
                s.pop()                     #두번 날려준다
                s.pop()
    if len(s) == 0:                         #길이가 0이면 yes 아니면 no 출력
        print("YES")
    else:
        print("NO")