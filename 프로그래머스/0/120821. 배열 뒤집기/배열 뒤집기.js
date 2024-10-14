function solution(num_list) {
    let answer = [];
    
    let len = num_list.length;
    
    for(let i = len-1; i>=0; i--){
        answer.push(num_list[i]);
    }
    
    return answer;
}