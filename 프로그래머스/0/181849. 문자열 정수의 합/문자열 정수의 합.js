function solution(num_str) {
    return num_str.split('').reduce((acc,cv)=>acc+Number(cv),0)
}