function solution(code) {
    let ret = [];
    let mode = 0; // mode: 0은 짝수 인덱스, 1은 홀수 인덱스

    for (let i = 0; i < code.length; i++) {
        if (code[i] === '1') {
            // 현재 값이 1이면 mode 전환
            mode = mode === 1 ? 0 : 1;
        } else {
            // mode에 따라 짝수 또는 홀수 인덱스 처리
            if ((mode === 0 && i % 2 === 0) || (mode === 1 && i % 2 !== 0)) {
                ret.push(code[i]); // 조건에 맞으면 ret에 추가
            }
        }
    }

    return ret.length>0?ret.join(''):'EMPTY' // 배열을 문자열로 결합하여 반환
}
