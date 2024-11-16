function solution(nums) {
    let len = nums.length/2;
    let max = new Set(nums);
    return len>max.size?max.size:len
    
    
}