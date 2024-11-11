function solution(my_string, queries) {
    let ans = Array.from(my_string);
    let qlen = queries.length;
    for(let i = 0; i<qlen; i++){
        let [s, e] = queries[i];
        let reverseS = ans.slice(s, e+1).reverse();
        ans.splice(s, e-s+1, ...reverseS)
    }
    return ans.join('');
}