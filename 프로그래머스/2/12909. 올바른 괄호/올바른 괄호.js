function solution(s){
    
    let stack = [];
    
    // 문자열 s를 순회하면서 여는 괄호이면 스택에 추가하고, 닫는 괄호가 나오면 stack에서 마지막 요소 제거
    for(let char of s){
        if(char === '('){
            stack.push(char);
        } else {
            // 닫는 괄호가 나왔을 때 스택의 길이가 0이면 false
            if(stack.length===0){
                return false;
            }
            stack.pop(); // 짝을 이루는 여는 괄호 제거
        }
    }
    // stack이 비어야 true
    return stack.length ===0;
    

}