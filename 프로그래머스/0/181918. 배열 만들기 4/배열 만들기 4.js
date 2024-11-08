function solution(arr) {
    let stk = [];
    let i = 0;
    
    while (i < arr.length) {  // i가 arr 길이보다 작을 때 반복
        if (stk.length === 0) {
            // stk가 빈 배열이면 arr[i]를 추가하고 i 증가
            stk.push(arr[i]);
            i += 1;
        } else if (stk[stk.length - 1] < arr[i]) {
            // stk의 마지막 원소가 arr[i]보다 작으면 arr[i]를 추가하고 i 증가
            stk.push(arr[i]);
            i += 1;
        } else {
            // stk의 마지막 원소가 arr[i]보다 크거나 같으면 stk의 마지막 원소 제거
            stk.pop();
        }
    }
    
    return stk;
}
