a = input().upper()

dic = {}

for i in range(len(a)): #인풋 값의 길이만큼 돈다
    if a[i] not in dic: #딕셔너리 안에 인풋의 i번째 항이 없다면 딕셔너리의 밸류 값은 1
        dic[a[i]] = 1
    else:
        dic[a[i]] += 1

maxV = 0
maxK = ''

for key in dic: 
    if dic[key] > maxV: #딕셔너리안의 밸류값이 maxV보다 크면  밸류값을 maxV로
        maxV = dic[key] #딕셔너리의 밸류값을 maxV에 대입
        maxK = key      #딕셔너리의 키 값을 maxK애 대입 **우항을 좌항에 대입(우항좌항)
cnt = 0
for key in dic: #딕셔너리 안에 있는 키 값을 돌면서 들어간다
    if dic[key] == maxV:    #밸류값이 maxV와 같다면
        cnt += 1            #카운트(maxV의 개수를 센다)에 +1
if cnt > 1:                 #카운트가 1보다 크면 물음표
    print("?")
else:
    print(maxK)