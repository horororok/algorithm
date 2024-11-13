function solution(arr) {
    let a = arr.findIndex(i => i === 2);
    let reversedArr = [...arr].reverse();  // 원본 배열을 변경하지 않도록 복사본 생성
    let b = reversedArr.findIndex(i => i === 2) !== -1 ? arr.length - reversedArr.findIndex(i => i === 2) - 1 : -1;

    if (a === -1) {
        return [-1];
    } else {
        return arr.slice(a, b + 1);
    }
}
