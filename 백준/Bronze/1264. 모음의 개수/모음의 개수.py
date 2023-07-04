

while True:
    sen = input()
    
    if sen == "#":
        break

    cnt = 0
    for i in sen:
        if i in "aeiouAEIOU":
            cnt += 1
    print(cnt)
