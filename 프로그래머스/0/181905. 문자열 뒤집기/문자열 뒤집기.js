function solution(my_string, s, e) {
    let ans = my_string.split('');
    let reverse = ans.slice(s, e + 1).reverse();
    let j = 0; 
    for (let i = s; i <= e; i++) {
        ans[i] = reverse[j];
        j++; 
    }
    return ans.join('');
}
