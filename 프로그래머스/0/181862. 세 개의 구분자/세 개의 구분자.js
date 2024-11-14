function solution(myStr) {
    let a = myStr.split('a').join(' ');
    let b = a.split('b').join(' ');
    let c = b.split('c').join(' ');
    let ans = c.split(' ').filter((e)=>e!=='')
    
    return ans.length===0?['EMPTY']: ans
}