function solution(myString) {
    return [...myString].map((e,i)=>e==='a'?e='A':(e!=='A'?e.toLowerCase():e)).join('')
}