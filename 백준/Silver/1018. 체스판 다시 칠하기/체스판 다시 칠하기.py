n, m = map(int, input().split())

box = []
for _ in range(n):
    box.append(input())

result = []
for i in range(n - 7):
    for j in range(m - 7):
        white = 0
        black = 0
        for x in range(i, i + 8):
            for y in range(j, j + 8):
                if (x + y) % 2 == 0:
                    if box[x][y] != "B":
                        white += 1
                    if box[x][y] != "W":
                        black += 1
                else:
                    if box[x][y] != "W":
                        white += 1
                    if box[x][y] != "B":
                        black += 1

        result.append(white)
        result.append(black)

print(min(result))