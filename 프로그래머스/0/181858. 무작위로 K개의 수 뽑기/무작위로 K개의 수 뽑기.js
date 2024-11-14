function solution(arr, k) {
    let ans = [];
    let em = 0;
    for (let i = 0; i < arr.length; i++) {
        if (em === k) {
            break;
        }
        // 중복값이 없으면 배열에 추가
        if (!ans.includes(arr[i])) {
            ans[em] = arr[i];
            em++;
        }
    }

    // 배열의 길이가 k보다 작을 경우 남은 자리에 -1을 채움
    while (ans.length < k) {
        ans.push(-1);
    }

    return ans;
}
