function solution(a, b) {
    ans = Number(String(a) + String(b)) >= Number(String(b) + String(a)) ? Number(String(a) + String(b)) : Number(String(b) + String(a))
    return ans
}