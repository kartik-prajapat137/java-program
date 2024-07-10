// Q1.> Create a button with th help of js ;
let newBtn = document.createElement("button");
newBtn.innerText ="Click me!";
newBtn.style.color ="white";
newBtn.style.backgroundColor ="red";
console.log(newBtn);

let body = document.querySelector("body");
body.prepend(newBtn);

//Q2.>

let pera = document.querySelector("p");