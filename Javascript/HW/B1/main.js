//b1
console.log("B1");

function mark(number) {
  if (number >= 85) {
    console.log("A");
  } else if (number >= 70) {
    console.log("B");
  } else if (number >= 40) {
    console.log("C");
  } else {
    console.log("D");
  }
}

mark(55);

//b2
console.log("B2");

function weekday(number) {
  switch (number) {
    case 0:
      console.log("Chủ nhật");
      break;
    case 1:
      console.log("Thứ 2");
      break;
    case 2:
      console.log("Thứ 3");
      break;
    case 3:
      console.log("Thứ 4");
      break;
    case 4:
      console.log("Thứ 5");
      break;
    case 5:
      console.log("Thứ 6");
      break;
    case 6:
      console.log("Thứ 7");
      break;
    default:
      break;
  }
}
weekday(4);

//b3
console.log("B3");

function randomNum(min, max) {
  console.log(Math.random() * (max - min) + min);
}

randomNum(1, 10);

// looping
console.log("Looping");

//b1
console.log("B1");

function oddSum(number) {
  let sum = 0;
  for (let i = 1; i < number; ) {
    sum += i;
    i += 2;
  }
  console.log(sum);
}

oddSum(100);


//b2
console.log("B2");

function multipleSum(minNum, maxNum, range) {
    let sum= 0;
    for(let i = minNum; i < range;) {
        if (i % maxNum == 0) {
            sum += i;
        }
        i += minNum;
    }
    console.log(sum);

}
multipleSum(3,5,100);
