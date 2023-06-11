n = int(input())
a = list(input())
m = 1234567891
r = 31

result = 0                  #합을 구할경우 0, 곱을 구할 경우 1 활용

for i in range(n):          #알파벳을 숫자로 바꾸기 위해 아스키 코드 활용
    num = ord(a[i]) - 96    #ord()는 아스키코드를 불러온다 a의 아스키 코드는 97
    result += num *(r ** i)
print(result % m)