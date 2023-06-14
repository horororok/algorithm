n = int(input())                            

Lst = []                                    #입력값을 리스트로 받기위한 빈 리스트
for i in range(n):                          
    age, name = map(str, input().split())   #나이와 이름을 각각 받아 줌
    age = int(age)                          #나이를 정수형으로 바꾸어 준다
    Lst.append((age, name))                 #나이와 이름을 리스트로 받아줌

Lst.sort(key = lambda x : x[0])             #(age, name)에서 age만 비교

for i in Lst:                               #리스트 형식이므로 하나씩 빼서 출력
    print(i[0], i[1])
    
#파이썬은 stable 정렬방식, 입력 받은 값들 중에 같은 값이 있는 경우 해당 값의 순서를 유지