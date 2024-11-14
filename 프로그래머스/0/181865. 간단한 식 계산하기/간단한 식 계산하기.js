function solution(binomial) {
    let arr = binomial.split(' ');
    const num1 = Number(arr[0]);
    const operator = arr[1];
    const num2 = Number(arr[2]);

    switch (operator) {
        case '+':
            return num1 + num2;
        case '-':
            return num1 - num2;
        case '*':
            return num1 * num2;
    }
}
