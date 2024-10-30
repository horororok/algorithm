const readline = require('readline');
const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

let input = [];

rl.on('line', function (line) {
    input = line.split(' ');
}).on('close', function () {
    const str = input[0];
    const n = Number(input[1]);
    // for (let i = 0; i < n; i++) {
    //     process.stdout.write(str); // 개행 없이 문자열 출력
    // }
    console.log(str.repeat(n)); // repeat 메서드를 활용하여 반복되는 문자열 출력
});
