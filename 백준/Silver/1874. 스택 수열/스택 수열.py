

n = int(input())

cnt = 1
temp = True                 #가능 여부 판별을 위한 boolean
stack = []
op = []                     #+, - 출력용 리스트
for i in range(n):          
    num = int(input())

    while cnt <= num:       #num 보다 작거나 같은 숫자들은 스택에 넣는다
        stack.append(cnt)
        op.append("+")
        cnt += 1
    
    if stack[-1] == num:    #스택의 맨 뒤 숫자가 num과 동일하면 pop
        stack.pop()
        op.append("-")
    else:                   #아니라면 boolean이 거짓이되고 반복문을 멈춘다
        temp = False
        break

if temp == False:
    print("NO")
else:
    for i in op:
        print(i)