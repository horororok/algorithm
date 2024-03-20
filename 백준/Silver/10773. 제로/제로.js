// Link: https://www.acmicpc.net/problem/10773

//K 개의 줄에 정수가 1개씩 주어진다.
//주어진 정수는 0부터 1,000,000 사이의 정수이다.
//정수가 0일 겨우 가장 최근에 쓴 수를 지우고, 아닐 경우 정수를 쓴다.
//최종적으로 적은 수의 합을 출력한다.

const fs = require("fs");
const input = fs.readFileSync("/dev/stdin").toString().split("\n");
// const input = fs.readFileSync("test.txt").toString().split("\n");

const solution = (input) => {
  const K = Number(input[0]); //첫 번째 줄은 K, 정수의 개수 저장, Number로 변환

  const stack = []; //스택 생성
  for (let i = 1; i <= K; i++) {
    //K번 반복
    if (Number(input[i]) === 0) {
      //0이면
      stack.pop(); //pop, pop은 배열의 마지막 요소를 제거하고 그 요소를 반환
    } else {
      stack.push(Number(input[i])); //아니면 push, push는 배열의 끝에 새로운 요소를 추가
    }
  }
  return stack.reduce((acc, cur) => acc + cur, 0); //결과값 반환, reduce로 합계 구함
};

console.log(solution(input)); //결과 출력

//reduce 메서드는 배열의 각 요소에 대해 주어진 콜백함수를 실행하고, 하나의 결과갑을 반환한다.
//reduce 메서드는 콜백함수의 4개의 인자를 받는다.
//누산기, 현재 값, 현재 인덱스, 원본 배열