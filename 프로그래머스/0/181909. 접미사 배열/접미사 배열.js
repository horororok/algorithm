function solution(my_string) {
    let temp = [];
    for(let i = 0; i<my_string.length; i++){
        temp.push(my_string.substring(i))
    }
    return temp.sort()
}