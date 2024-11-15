function solution(n) {
    let ans =  Array(n).fill(Array(n).fill(0))
    return ans.map((e,i)=>e.map((e2,i2)=>i===i2?e2=1:e2))
}