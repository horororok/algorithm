function solution(babbling) {
    const WORD_LIST = ["aya", "ye", "woo", "ma"];
    
    //reduce로 babbling 배열의 각 단어 순회
    return babbling.reduce((count, word)=>{ 
        let tempWord = word; // 임시 변수에 입력받은 배열의 현재 요소 복사
        // 가능한 발음 배열 반복
        for(const sound of WORD_LIST){ 
            // 각 소리를 tempWord에서 찾아서 공백으로 바꾼다.
            tempWord = tempWord.split(sound).join(' '); 
        }
        // 양쪽 공백 제거하고 빈문자열인지 확인
        if(tempWord.trim()===''){ // 빈문자열이면 count 증가
            count++;
        }
        return count;
    }, 0);
}