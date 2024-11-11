function solution(number) {
    let acc = number.split('');
    let ans = acc.reduce((ac, el) => ac + Number(el), 0); // 초기값 0 설정
    return ans%9
}
