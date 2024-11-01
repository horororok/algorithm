function solution(str1, str2) {
 arr1 = str1.split('');
    arr2 = str2.split('')
    let ans = []
    for(let i = 0; i<arr1.length; i++){
        ans.push(arr1[i])
        ans.push(arr2[i])
    }
    return ans.join('');
}