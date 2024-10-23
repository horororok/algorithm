function solution(n, s) {
    var answer = [];
    
    // s가 n보다 작으면, n개의 자연수로 s를 만들 수 없으므로 [-1]을 반환
    if (s < n) return [-1];
    
    // 몫과 나머지를 계산
    let quotient = Math.floor(s / n);
    let remainder = s % n;
    
    // 몫을 n개로 추가한 뒤, 나머지만큼 더해줘서 최대 곱이 되도록 배열 구성
    for (let i = 0; i < n - remainder; i++) {
        answer.push(quotient);
    }
    for (let i = 0; i < remainder; i++) {
        answer.push(quotient + 1);
    }
    
    return answer;
}
