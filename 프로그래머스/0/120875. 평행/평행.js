function solution(dots) {
    function slope(dot1, dot2) {
        // 두 점을 이었을 때의 기울기 계산
        return dot2[0] === dot1[0] ? Infinity : (dot2[1] - dot1[1]) / (dot2[0] - dot1[0]);
    }

    // 가능한 세 가지 직선 쌍에 대해 기울기를 비교
    return (slope(dots[0], dots[1]) === slope(dots[2], dots[3]) ||
            slope(dots[0], dots[2]) === slope(dots[1], dots[3]) ||
            slope(dots[0], dots[3]) === slope(dots[1], dots[2])) ? 1 : 0;
}
