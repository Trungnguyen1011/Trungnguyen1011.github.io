// define

const timer = document.querySelector(".item .time");
const score = document.querySelector(".item .score");
const firstNum = document.querySelector("#primary-number");
const secondNum = document.querySelector("#secondary-number");
const operator = document.querySelector("#operator");
const result = document.querySelector("#result");

let operators = ["+", "-", "*"];

function generateRandom() {
  return Math.floor(Math.random() * 10);
}
let globalTime = 45;

function defaultLoad(sc) {
  timer.innerText = globalTime;
  score.innerText = sc;
  firstNum.innerText = generateRandom();
  secondNum.innerText = generateRandom();
  operator.innerText = operators[parseInt(generateRandom() / 3.4)];
  result.value = "";
}

document.addEventListener("keydown", (event) => {
  if (event.key === "Enter") {
    if (
      calculating(
        firstNum.innerText,
        secondNum.innerText,
        operator.innerText,
        result.value
      )
    ) {
      let newscore = Number(score.innerText) + 1;

      console.log(score);
      console.log(newscore);
      result.style.color = "black";

      defaultLoad(newscore);
    } else {
      result.style.color = "red";
    }
  }
});

function calculating(num1, num2, ope, result) {
  let answer = 0;
  switch (operators.indexOf(ope)) {
    case 0:
      answer = Number(num1) + Number(num2);
      break;
    case 1:
      answer = num1 - num2;
      break;
    case 2:
      answer = num1 * num2;
      break;
    default:
      break;
  }

  if (answer == result) {
    return true;
  } else {
    console.log(answer);
    console.log(result);
    return false;
  }
}
function start() {
  let countdown = setInterval(function () {
    let curTime = timer.innerText - 1;
    timer.innerText = curTime;
    globalTime = curTime;
    if (globalTime == 0) {
      clearInterval(this);
      if (
        confirm(
          "Hết giờ, điểm của bạn là: " +
            score.innerText +
            "\n" +
            "Bạn muốn chơi lại chứ?"
        )
      ) {
        globalTime = 45;
        defaultLoad(0);
        start();
      }
    }
  }, 1000);


}


window.onload = defaultLoad(0), start();

