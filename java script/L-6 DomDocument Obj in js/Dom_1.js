// console.log("Hellow");
// console.dir(window.document);
// console.dir(document.body);
// console.log(document.body);
// console.dir(document.head);

let div = document.getElementById("div1");
console.dir(div);
console.log(div);

let classes = document.getElementsByClassName("myclass");
console.dir(classes);
console.log(classes);

let peras = document.getElementsByTagName("p");
console.dir(peras);
// console.log(peras);

let firstEl = document.querySelector("p");
// console.dir(firstEl);
console.log(firstEl);

let Allpera = document.querySelectorAll("p");
// console.dir(Allpera); 
console.log(Allpera);

let clas = document.querySelector(".myclass");
console.dir(clas);

let Allclass = document.querySelectorAll(".myclass");
console.dir(Allclass);

let Allid = document.querySelectorAll("#div");
console.dir(Allid);