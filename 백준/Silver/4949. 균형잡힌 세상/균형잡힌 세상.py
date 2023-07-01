import sys
input = sys.stdin.readline


while True:
    a = input().rstrip()
    Stack = []      #괄호를 추가할 스택 리스트

    if a == ".":
        break

    for i in a:
        if i == "(" or i == "[":        #여는 괄호가 오면 스택에 추가 해 준다  
            Stack.append(i)
        elif i == ")":                  #닫는 괄호인 경우
            if len(Stack) != 0 and Stack[-1] == "(":    #스택이 비어있지 않고 마지막요소가 ")"  
                Stack.pop()                             #pop 해준다.
            else:
                Stack.append(i)                    #스택이 비어있거나 짝이 맞지 않으면 스택에 )을 추가
                break                               #후에 break
        elif i == "]":                  #[ 인 경우
            if len(Stack) != 0 and Stack[-1] == "[":    #스택이 비어있지 않고, 마지막 요소가 [ 인 경우
                Stack.pop()                             #pop
            else:                                       #스택이 비어있거나 짝이 맞지 않으면 스택에 ]추가
                Stack.append(i)                         
                break     

    if len(Stack) == 0:     #스택이 비어있다면 모든 괄호들의 규형이 맞는 것이므로 yes 출력
        print("yes")
    else:                   
        print("no")