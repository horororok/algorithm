function solution(str_list, ex) {
    let ans = '';
    str_list.map((e)=>e.includes(ex)?'':ans+=e)
    return ans
}