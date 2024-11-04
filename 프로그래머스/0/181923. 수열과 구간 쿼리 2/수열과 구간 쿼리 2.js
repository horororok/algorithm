function solution(arr, queries) {
    let ansArr = [];
    const qlen = queries.length;

    for (let i = 0; i < qlen; i++) {
        let s = queries[i][0];
        let e = queries[i][1];
        let k = queries[i][2];
        let ans = Infinity;  // 최소값 추적을 위해 초기값을 Infinity로 설정

        for (let j = s; j <= e; j++) {
            if (arr[j] > k && arr[j] < ans) {
                ans = arr[j];
            }
        }

        ansArr.push(ans === Infinity ? -1 : ans);
    }

    return ansArr;
}
