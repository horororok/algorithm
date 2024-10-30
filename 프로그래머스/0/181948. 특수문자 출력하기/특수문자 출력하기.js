const readline = require('readline');
const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

rl.on('close', function () {
    console.log('!@#$%^&*(\\\'\"<>?:;'); // escape 시퀀스 \ 를 활용하여 백슬래시와 따옴표 출력
});