const heading = document.getElementById("heading")
console.log(heading)

const p2 = document.getElementsByTagName("p")
console.log(p2)

const para = document.getElementsByClassName("para")
console.log(para)

const head = document.querySelector("#heading")
console.log(head)
const box = document.querySelector(".box")

const ndp = document.querySelector("body ul li:last-child")
console.log(ndp)

const pall = document.querySelectorAll("p")
console.log(pall)

const ul1 = document.querySelector("body ul");
console.log(ul1);
let lihere = document.createElement("li");
lihere.innerText = "li new";
console.log(lihere);
ul1.insertBefore(lihere, ndp);

box.insertAdjacentHTML("afterend","<button type='button' style='background-color: red; color: white'>Click Me</button>")

