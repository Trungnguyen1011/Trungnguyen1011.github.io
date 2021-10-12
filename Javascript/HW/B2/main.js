// Bài 1: Viết function kiểm tra 1 giá trị có nằm trong mảng hay không
function checkEleExist(array, element) {
  return array.includes(element);
}

// Bài 2: Viết function tìm ra số lớn thứ nhì trong mảng các số.
function max2Numbers(array) {
  const sortedArr = array.sort((a, b) => b - a);
  return sortedArr[1];
}

// Bài 3: Cho 1 mảng các chuỗi. Viết function lọc ra các phần tử có độ dài lớn nhất.
function findMaxLengthElement(array) {
  const sortedArr = array.sort((a, b) => b.length - a.length);

  return array.filter((string) => string.length == sortedArr[0].length);
}
// Bài 4: Viết function có tác dụng biến 1 chuỗi thành chuỗi chỉ viết hoa từ đầu tiên.
function capitalizeString(string) {
  return string
    .toLowerCase()
    .split(" ")
    .map(word => word.charAt(0).toUpperCase().concat(word.slice(1)))
    .join(" ");
}
// Bài 5: Viết function với đầu vào là 1 chuỗi string. Trả về chuỗi đảo ngược của chuỗi đó

function reverseString(string) {
  return string.split("").reverse().join("");
}
// Bài 6: Cho 1 chuỗi, kiểm tra xem chuỗi đó có phải chuỗi đối xứng hay không (đọc xuôi hay ngược đều như nhau, không tính khoảng trắng, không phân biệt hoa thường),

function checkSymmetricString(string) {
  const newString = string.replace(" ", "");
  if (newString.length % 2 == 0) {
    return false;
  }
  const stringArr = newString.toLowerCase().split("");
  const stringArr2 = stringArr.reverse();

  for (let i = 0; i < stringArr.length; i++) {
    if (stringArr[i] != stringArr2[i]) {
      return false;
    }
  }
  return true;
}

//test
const arr = [1, 2, 3, 4, 5];
const stringArr = ["aba", "aa", "ad", "c", "vcd"];
const string1 = "chÀo MừnG đẾn với techMaster";
const string2 = "Race car";
const string3 = "hello world";

// console.log(checkEleExist(arr, 4));
// console.log(checkEleExist(arr, 6));

// console.log(max2Numbers(arr));

// console.log(findMaxLengthElement(stringArr));
// console.log(findMaxLengthElement(string1.split(" ")));

console.log(capitalizeString(string1));

// console.log(reverseString(string1));
// console.log(reverseString(string3));

// console.log(checkSymmetricString(string2));
// console.log(checkSymmetricString(string3));
