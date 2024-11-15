function solution(date1, date2) {
    const [y1, m1, d1] = date1;
    const [y2, m2, d2] = date2;

    // 연도 비교
    if (y1 < y2) {
        return 1;
    } else if (y1 > y2) {
        return 0;
    }

    // 연도가 같다면 월 비교
    if (m1 < m2) {
        return 1;
    } else if (m1 > m2) {
        return 0;
    }

    // 연도와 월이 같다면 일 비교
    if (d1 < d2) {
        return 1;
    }

    return 0;
}
