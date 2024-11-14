function solution(myString, pat) {
    let str = [...myString].map((e)=>e==='A'?'B':'A').join('')
    return +str.includes(pat)
}