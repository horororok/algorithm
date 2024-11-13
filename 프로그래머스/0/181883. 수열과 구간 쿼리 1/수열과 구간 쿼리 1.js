function solution(arr, queries) {
    let ans = [...arr]
    for(let i = 0; i<queries.length; i++){
        let [s, e] = queries[i];
        ans.splice(s, e-s+1, ...ans.slice(s,e+1).map(num=>num+1) )
    }
    return ans
}