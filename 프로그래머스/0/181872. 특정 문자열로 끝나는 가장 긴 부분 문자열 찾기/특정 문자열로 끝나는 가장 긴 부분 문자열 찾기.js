function solution(myString, pat) {
    let lastIndex = myString.lastIndexOf(pat); 
    return  myString.slice(0, lastIndex + pat.length)
}
