function solution(arr, queries) {
    let ansArr = [...arr];
    for(let i = 0; i<queries.length; i++){
        [ansArr[queries[i][0]], ansArr[queries[i][1]]] = [ansArr[queries[i][1]],ansArr[queries[i][0]] ]
    }
    return ansArr;
}