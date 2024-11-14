function solution(arr) {
    let ans = [];
    for(let val of arr){
        let n = val
        while(n>0){
            ans.push(val)
            n--
        }
    }
    return ans
}