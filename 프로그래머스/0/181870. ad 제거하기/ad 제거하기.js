function solution(strArr) {
    let ans = [];
    for(let val of strArr){
        if(!val.includes('ad')){
            ans.push(val)
        }
            
    }
    return ans
}