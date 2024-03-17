const fs = require("fs");

const input = fs.readFileSync("/dev/stdin").toString().trim();
const N = parseInt(input);

if (N === 0) {
  console.log('*');
} else if (N === 1) {
  console.log('**\n*');
} else {
  const size = Math.pow(2, N);
  const board = [];

  const init = (N) => {
    let en = N;
    for (let i = 0; i < N; i++) {
      board[i] = [];
      for (let j = 0; j < en; j++) {
        board[i][j] = '*';
      }
      en--;
    }
  };

  const star = (y, x, size) => {
    let st = x + size / 2 - 1;
    for (let i = y + 1; i < y + size / 2; i++) {
      for (let j = st; j < x + size / 2; j++) {
        board[i][j] = ' ';
      }
      st--;
    }
    if (size === 4) return;
    star(y, x, size / 2);
    star(y, x + size / 2, size / 2);
    star(y + size / 2, x, size / 2);
    return;
  };

  init(size);
  star(0, 0, size);
  let en = size;
  for (let i = 0; i < size; i++) {
    let row = '';
    for (let j = 0; j < en; j++) {
      row += board[i][j];
    }
    console.log(row);
    en--;
  }
}