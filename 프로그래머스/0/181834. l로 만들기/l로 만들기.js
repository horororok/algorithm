function solution(myString) {
    return [...myString].map((e)=>e.charCodeAt()<'l'.charCodeAt()?'l':e).join('')
}