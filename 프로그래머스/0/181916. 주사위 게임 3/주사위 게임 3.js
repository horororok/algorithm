function solution(a, b, c, d) {
    const dice = [a, b, c, d];
    const countMap = new Map();

    // 주사위 각 숫자의 빈도수 카운트
    dice.forEach(num => countMap.set(num, (countMap.get(num) || 0) + 1));

    const values = Array.from(countMap.keys());
    const counts = Array.from(countMap.values());

    // 1. 모든 주사위가 같은 경우
    if (counts.length === 1) {
        return 1111 * values[0];
    }

    // 2. 세 개의 주사위가 같은 경우
    if (counts.includes(3)) {
        const p = values[counts.indexOf(3)];
        const q = values[counts.indexOf(1)];
        return (10 * p + q) ** 2;
    }

    // 3. 두 개씩 같은 경우
    if (counts.length === 2 && counts.every(count => count === 2)) {
        const [p, q] = values;
        return (p + q) * Math.abs(p - q);
    }

    // 4. 두 개의 주사위가 같고 나머지가 다른 두 수인 경우
    if (counts.length === 3) {
        const q = values[counts.indexOf(1)];
        const r = values[counts.lastIndexOf(1)];
        return q * r;
    }

    // 5. 모든 숫자가 다를 경우
    return Math.min(...dice);
}
