function solution(arr, query) {
    let ans = [...arr];
    for(let i = 0; i < query.length; i++) {
        const index = query[i];  // query[i]의 값을 인덱스로 사용하여 실제 값을 참조
        if (i % 2 === 0) {
            ans = ans.slice(0, index + 1);  // 짝수 인덱스에서는 index 뒷부분을 잘라냄
        } else {
            ans = ans.slice(index);         // 홀수 인덱스에서는 index 앞부분을 잘라냄
        }
    }
    return ans;
}
