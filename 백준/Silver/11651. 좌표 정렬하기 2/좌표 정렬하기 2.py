import sys
input = sys.stdin.readline

n = int(input().strip())

List = []
for i in range(n):
    x, y = map(int, input().strip().split())

    List.append((x, y))

List.sort(key = lambda x : (x[1], x[0]))

for x, y in List:
    print(x, y)


#정렬을 할 때에는 기본적으로는 튜플이 저장된 리스트에서 sort 함수를 적용하면 된다
#sort의 인자에 key 값을 부여하여 할 수 있다. 기본적으로 오름차순으로 정렬되며
#내림차순으로 정렬하기 위해서는 reverse = True 매개변수를 추가적으로 부여한다.