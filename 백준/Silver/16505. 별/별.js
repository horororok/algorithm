const fs = require("fs");
const input = fs.readFileSync("/dev/stdin").toString().split("\n");

function solution() {
  // 문제 풀이 함수

  function star(n) {
    // 별 찍기 패턴을 생성하는 재귀 함수
    if (n <= 0) return ["*"]; // N이 0일 경우 별 하나만 출력
    const prev = star(n - 1); // n-1 번째로 찍은 별 패턴을 저장
    const m = 2 ** (n - 1); // 2의 n-1 제곱을 m에 저장 (패턴의 크기)
    let r = Array(m * 2).fill(""); // 별을 저장할 배열을 생성 (패턴의 크기의 2배)
    for (let i = 0; i < m * 2; i++) r[i] += prev[i % m]; // 배열을 별로 채움
    for (let i = 0; i < m; i++) r[i] += prev[i % m]; // 0부터 패턴 크기만큼 반복하여 별을 저장
    for (let i = m; i < m * 2; i++) r[i] += " ".repeat(m); // 별을 채우고 남은 공간을 공백으로 채움
    return r; // 결과값 반환
  }

  const N = Number(input[0]); // 첫 번째 줄은 N
  for (let s of star(N)) console.log(s.trimEnd()); // 반복문을 통해 별을 출력
}

solution(); // 문제 풀이 함수 실행