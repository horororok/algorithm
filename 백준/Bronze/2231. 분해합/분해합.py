a = int(input())                #분해합을 입력값으로 받는다

for i in range(1, a+1):         #해당 분해합의 생성자 찾기
    num = sum(map(int, str(i))) # i의 각 자릿수 더하기
    num_sum = i + num            #분해합 = 생성자 + 각 자릿수의 합
#i가 작은 수부터 차례로 들어가므로 
#처음으로 분해합과 입력값이 같을 때 가장 작은 생성자를 가진다
    if num_sum == a:            #분해합이 입력값과 같다면 생성자 출력
        print(i)
        break
    if i == a:                  #생성자 i와 입력값이 같다는 것은 생성자가 없다는 뜻
        print(0)
