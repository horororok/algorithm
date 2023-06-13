n, k = map(int, input().split())
                            #이항계수란 조합의 수를 말함
                            # n C k = n! / (k! * (n - k)!)
a = 1
for i in range(1, n+1):
    a *= i                  # n!을 만들어줌

b = 1
for i in range(1, k+1):
    b *= i                  # k!을 만들어줌

c = 1
for i in range(1, n-k +1):
    c *= i                  # (n - k)! 을 만들어줌

print(a // (b * c))