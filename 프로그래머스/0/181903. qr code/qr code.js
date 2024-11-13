function solution(q, r, code) {
    let ans = '';
    Array.from(code).forEach((e, i) => {
        if (i % q === r) ans += e;
    });
    return ans;
}
