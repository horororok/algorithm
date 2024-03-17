// 종이의 개수
// 1780번: https://www.acmicpc.net/problem/1780
// N * N 크기의 종이, 각칸에 -1, 0, 1 중 하나가 쓰여있다.
// 종이가 모두 같은 수로 되어 있다면 그대로 사용
// 아니라면 9등분하여 같은 방식으로 종이를 자른다.
// 이때 각 숫자별 종이의 개수를 출력하라.

// const input = require('fs').readFileSync('/dev/stdin').toString().trim().split('\n');

const fs = require("fs");
const input = fs.readFileSync("/dev/stdin").toString().trim().split("\n");

const solution = (input) => {
  const N = Number(input[0]);
  const paper = input.slice(1).map((el) => el.split(" ").map(Number));
  const result = [0, 0, 0];

  const checkPaper = (x, y, n) => {
    const num = paper[x][y];
    for (let i = x; i < x + n; i++) {
      for (let j = y; j < y + n; j++) {
        if (num !== paper[i][j]) {
          return false;
        }
      }
    }
    return true;
  };

  const dividePaper = (x, y, n) => {
    if (checkPaper(x, y, n)) {
      result[paper[x][y] + 1]++;
      return;
    }
    const m = n / 3;
    for (let i = 0; i < 3; i++) {
      for (let j = 0; j < 3; j++) {
        dividePaper(x + m * i, y + m * j, m);
      }
    }
  };

  dividePaper(0, 0, N);
  return result.join("\n");
};

console.log(solution(input));