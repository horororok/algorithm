function solution(rank, attendance) {
  // 참여 가능한 학생의 번호와 등수를 포함한 배열을 생성
  const students = rank
    .map((r, i) => ({ rank: r, index: i }))      // 각 학생의 등수와 인덱스를 객체 형태로 저장
    .filter((_, i) => attendance[i])              // 참여 가능한 학생만 남기기
    .sort((a, b) => a.rank - b.rank);             // 등수 오름차순 정렬

  // 상위 3명의 학생 번호 (인덱스) 가져오기
  const [a, b, c] = students.slice(0, 3).map(s => s.index);

  // 결과 값 계산 및 반환
  return 10000 * a + 100 * b + c;
}
