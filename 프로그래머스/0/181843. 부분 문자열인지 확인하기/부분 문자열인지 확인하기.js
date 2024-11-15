function solution(my_string, target) {
    let len = target.length;
    let i = 0;
    while(i<=my_string.length-len){
        if(my_string.slice(i,i+len)===target){
            return 1;
        }
        i++;
    }
    return 0
}