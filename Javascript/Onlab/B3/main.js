let grades = [
  { name: "John", grade: 8, sex: "M" },
  { name: "Sarah", grade: 12, sex: "F" },
  { name: "Bob", grade: 16, sex: "M" },
  { name: "Johnny", grade: 2, sex: "M" },
  { name: "Ethan", grade: 4, sex: "M" },
  { name: "Paula", grade: 18, sex: "F" },
  { name: "Donald", grade: 5, sex: "M" },
  { name: "Jennifer", grade: 13, sex: "F" },
  { name: "Courtney", grade: 15, sex: "F" },
  { name: "Jane", grade: 9, sex: "F" },
];

function pickMale(a) {
  return a.filter((a) => a.sex === "M");
}

// 1. Tìm thứ hạng trung bình của cả lớp

function avgGrade(a) {
  return (a.reduce((a, b) => a + b.grade, 0) / a.length).toFixed(2);
}
// 2. Tìm thứ hạng trung bình của nam trong lớp

function maleAvgGrade(a) {
  return avgGrade(pickMale(a));
}

// 3. Tìm thứ hạng trung bình của Nữ trong lớp

function femaleAvgGrade(a) {
  return avgGrade(pickFemale(a));
}

// 4. Tìm thứ hạng cao nhất của Nam trong lớp

function bestMaleGrade(a) {
  return bestGrade(pickMale(a));
}

// 5. Tìm thứ hạng cao nhất của Nữ trong lớp

function bestFemaleGrade(a) {
  return bestGrade(pickFemale(a));
}
// 6. Tìm thứ hạng thấp nhất của Nam trong lớp

function worstMaleGrade(a) {
  return worstGrade(pickMale(a));
}
// 7. Tìm thứ hạng thấp nhất của Nữ trong lớp

function worstFemaleGrade(a) {
  return worstGrade(pickFemale(a));
}
// 8. Tìm thứ hạng cao nhất của cả lớp

function bestGrade(a) {
  return Math.max(...a.map((a) => a.grade));
}

// 9. Tìm thứ hạng thấp nhất của cả lớp

function worstGrade(a) {
  return Math.min(...a.map((a) => a.grade));
}
// 10. Lấy ra danh sách tất cả học viên nữ trong lớp

function pickFemale(a) {
  return a.filter((a) => a.sex === "F");
}

// 11. Sắp xếp tên học viên theo chiều tăng dần của bảng chữ cái

function nameSorting(a) {
    let result = [...a];
  return result.sort((a, b) => a.name.localeCompare(b.name));
}

// 12. Sắp xếp thứ hạng học viên theo chiều giảm dần
function gradeSorting(a) {
  let result = [...a];
  return result.sort((a, b) => b.grade - a.grade);
}

// 13. Lấy ra học viên nữ có tên bắt đầu bằng "J"

function pickJFemale(a) {
  return pickFemale(a).filter((a) => a.name.charAt(0).toLowerCase() === "j");
}
// 14. Lấy ra top 5 người có thứ hạng cao nhất

function topFive(a) {
    let result = [...a];
  return result.sort((a, b) => b.grade - a.grade).slice(0, 5);
}
