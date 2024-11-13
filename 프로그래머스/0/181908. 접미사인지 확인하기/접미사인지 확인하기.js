function solution(my_string, is_suffix) {
    let temp = Array.from(my_string).map((e,i)=>my_string.slice(i))
    let isbool = temp.filter((el)=>el===is_suffix)
    if(isbool.length>0){
        return 1;
    }else{
        return 0;
    }
}