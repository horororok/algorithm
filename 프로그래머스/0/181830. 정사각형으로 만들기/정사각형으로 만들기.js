function solution(arr) {
    let len1 = arr.length; // 행의 길이
    let len2 = arr[0].length; // 열의 길이
    let len = Math.max(len1, len2); // 가장 긴 길이로 맞춤

    // 행과 열이 같으면 그대로 반환
    if (len1 === len2) {
        return arr;
    }

    // 행의 길이가 더 길면 각 행의 열을 0으로 채움
    if (len1 > len2) {
        return arr.map((row) => row.concat(Array(len1 - len2).fill(0)));
    }

    // 열의 길이가 더 길면 부족한 행을 0으로 채움
    while (arr.length < len) {
        arr.push(Array(len2).fill(0));
    }
    return arr;
}
