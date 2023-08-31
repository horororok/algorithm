import sys
input = sys.stdin.readline

a, b, v = map(int, input().split())

d = (v - b) / (a - b)               #도달하는 날이 d 이면 올라가는 횟수 d번, 
if  d == int(d):                    #내려오는 횟수 d -1 번
    print(int(d))                   #Ad - B(d - 1) = V가 되므로
else:                               #d = (V - B) / (A - B)
    print(int(d) + 1)
# d가 d의 정수형과 같다면(나누어 떨어진다면) d일에 다 올라갈 것이다.
#아니라면, 하루더 지나서 다 올라갈 것이다.(ex - 7.0일경우 7일만에 다 올라감
# 7.4일 경우 8일만에 다 올라감)



# print(int(d) if d ==int(d) else int(d)+ 1)