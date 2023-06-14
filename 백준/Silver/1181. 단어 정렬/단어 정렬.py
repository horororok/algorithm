import sys

n = int(sys.stdin.readline())

Lst =[]                 # 입력값을 리스트로 만들기 위해 빈 리스트 준비
for i in range(n):      
    Lst.append(sys.stdin.readline().strip()) # 입력값을 리스트로 만들어 준다

setLst = set(Lst)       # 중복값을 제거 하기 위해 set로 만들어준다
Lst = list(setLst)      # set를 다시 리스트로 만들어 준다
Lst.sort()              # sort를 이용해서 알파벳 순 정렬
Lst.sort(key = len)     # sort를 이용해서 길이 순 정렬

for i in Lst:           # 리스트 형으로 만들어준 리스트를 다시 풀어 준다.
    print(i)

# sort는 문자도 알파벳 순으로 정렬을 해준다!!