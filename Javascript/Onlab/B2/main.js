let a = [1, 2, 3, 4];
let b = [1, 2, 4, 3];
let c = [2, 4, 6, 8];
let d = [2, 4, 7, 8];

function checkAscArr(a) {
  for (let i = 0; i < a.length - 1; i++) {
    if (a[i] > a[i + 1]) {
      return false;
    }
  }
  return true;
}
console.log(checkAscArr(a));

console.log(checkAscArr(b));

function checkEvenAscArr(a) {
  for (let i = 0; i < a.length - 1; i++) {
    if (a[i] > a[i + 1] || a[i] % 2 != 0 || a[i + 1] % 2 != 0) {
      return false;
    }
  }
  return true;
}

console.log(checkEvenAscArr(c));

console.log(checkEvenAscArr(d));

function findMax(a) {
  let max = a[0];
  for (let i = 1; i < a.length; i++) {
    if (a[i] > max) {
      max = a[i];
    }
  }

  return max;
}

console.log(findMax(a));
console.log(findMax(d));
