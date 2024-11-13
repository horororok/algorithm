function solution(names) {
    let arr = [...names];
    let ans = [];
    for(let i=0; i<arr.length; i+=5){
        ans.push(arr[i])
    }
    return ans
}