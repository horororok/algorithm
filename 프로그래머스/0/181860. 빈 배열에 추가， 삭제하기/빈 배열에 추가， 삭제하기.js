function solution(arr, flag) {
    return arr.reduce((acc, cv, i) => {
        if (flag[i]) {
            // flag가 true일 때 cv를 cv*2 길이만큼 추가
           return acc.concat(Array(cv * 2).fill(cv));
        } else {
            // flag가 false일 때 뒤에서 cv 개수만큼 제거
            return acc.slice(0, acc.length - cv);
        }
    }, []);
}
