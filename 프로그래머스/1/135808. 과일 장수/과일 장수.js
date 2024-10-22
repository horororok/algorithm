function solution(k, m, score) {
    let result = 0;

    // score를 내림차순으로 정렬
    let ansScore = score.sort((a, b) => b - a);

    if (score.length >= m) {
        for (let i = 0; i < score.length; i += m) {
            const slicedArr = ansScore.slice(i, i + m);

            // 자른 배열이 m개의 요소를 가지고 있을 때만 처리
            if (slicedArr.length === m) {
                result += slicedArr[m - 1] * m;  // 마지막 요소 * m
            }
        }
    } else {
        return 0;
    }

    return result;
}
