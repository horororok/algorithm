function solution(num_list) {
    let ans1 = num_list.reduce((acc, cV)=>acc*cV, 1)
    let ans2 = num_list.reduce((acc, cV)=>acc+cV, 0)**2
    
    return ans1>ans2 ? 0:1;
}