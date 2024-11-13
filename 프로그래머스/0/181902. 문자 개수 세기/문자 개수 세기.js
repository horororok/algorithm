function solution(my_string) {
    const counts = Array(52).fill(0);

    for (const char of my_string) {
        if (char >= 'A' && char <= 'Z') {
            // 대문자는 0 ~ 25번 인덱스에 저장
            counts[char.charCodeAt(0) - 'A'.charCodeAt(0)]++;
        } else if (char >= 'a' && char <= 'z') {
            // 소문자는 26 ~ 51번 인덱스에 저장
            counts[char.charCodeAt(0) - 'a'.charCodeAt(0) + 26]++;
        }
    }

    return counts;
}
