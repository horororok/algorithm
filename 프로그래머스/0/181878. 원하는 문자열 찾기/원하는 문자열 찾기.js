function solution(myString, pat) {
    let arr = myString.toUpperCase(); 
    let a = pat.toUpperCase();        
    return arr.includes(a) ? 1 : 0;
}
