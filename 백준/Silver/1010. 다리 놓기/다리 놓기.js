const fs = require('fs');

const input = fs.readFileSync('/dev/stdin').toString().trim().split('\n');

const T = parseInt(input[0]); // 테스트 케이스의 개수

for (let i = 1; i <= T; i++) { // 테스트 케이스의 개수만큼 반복
  const [N, M] = input[i].split(' ').map(Number); // N과 M을 받아온다.
  console.log(combi(M, N)); // combi 함수에 M과 N을 넣어서 출력
}

function combi(n, r) { // nCr을 구하는 함수
  let result = 1; // 결과값을 1로 초기화
  for (let i = 1; i <= r; i++) {  // r번 반복
    result = result * (n - i + 1) / i; // nCr을 구하는 공식
  }
  return result;  // 결과값 반환
}