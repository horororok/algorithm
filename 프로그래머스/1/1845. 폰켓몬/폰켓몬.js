function solution(nums) {
    let len = nums.length/2;
    let ans=[];
    for(let val of nums){
        if(ans.includes(val)){
            continue;
        }else{
            ans.push(val)
        }
    }
    return ans.length>len?len:ans.length
    
}