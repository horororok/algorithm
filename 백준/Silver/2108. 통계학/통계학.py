import sys
input = sys.stdin.readline


n = int(input())

numList = []
for i in range(n):
    numList.append(int(input().rstrip()))

print(round(sum(numList) / len(numList)))   #산술평균

a = n // 2
sList = sorted(numList)

print(sList[a])     #중앙값

dic = dict()                    #딕셔너리에 각 숫자의 빈도를 저장한다.
for i in sList:
    if i in dic:
        dic[i] += 1
    else:
        dic[i] = 1

maxNum = max(dic.values())      #빈도중 최대값(최빈값)을 갖는 값을 변수에 저장한다
maxNumList = []

for i in dic:                   #최빈값의 key값을 빈 배열에 추가하고, 
    if maxNum == dic[i]:        #최빈값이 여러 개인지 아닌지에 따라 값을 출력
        maxNumList.append(i)

if len(maxNumList) > 1:
    print(maxNumList[1])
else:
    print(maxNumList[0])        #최빈수 중 두번째로 작은 수, 최빈수

print(max(sList) - min(sList))  #범위
