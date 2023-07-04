import sys

def my_round(val):
  if val - int(val) >= 0.5:
    return int(val) + 1
  else:
    return int(val)

n = int(sys.stdin.readline().rstrip())
if n:
  level = []
  for _ in range(n):
    level.append(int(sys.stdin.readline().strip()))

  nn = my_round(n * 0.15)
  level.sort()
  if nn > 0:
    print(my_round(sum(level[nn : -nn]) / len(level[nn : -nn])))
  else:
    print(my_round(sum(level) / len(level)))
else:
  print(0)

#파이썬의 round 함수는 사사오입이 아닌 오사오입이므로 새롭게 사사오입 함수를 정의해주거나
#값에 0.5를 더한후 int를 적용해 구한다

#먼저 반올림해주는 my_round 함수를 구현한다.
#그 후에 n을 입력받아서 n == 0이면 0 출력
#n != 0이면 모든 난이도 의견을 level 리스트에 저장하고 오름차순 정렬
#절사평균 nn을 구한 루 nn > 0 이면 가장 큰 nn명의 난이도의견과 가장 낮은 nn명의 난이도 의견 제외
#나머지 난이도 의견들의 평균 출력
