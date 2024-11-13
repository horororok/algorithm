function solution(my_strings, parts) {
    let ans= '';
    parts.map((e, i)=>ans+= my_strings[i].slice(e[0], e[1]+1))
    return ans;
}