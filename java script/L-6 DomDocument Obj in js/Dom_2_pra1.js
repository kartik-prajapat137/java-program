// par Q1.> create h2 tag write "hello java script" and Append "Apna College Students" to This Text Using in js.

let h2 = document.querySelector("h2");
//console.dir(h2);
//console.dir(h2.innerText);

h2.innerText = h2.innerText + "From Apna College";


//Pra Q2.>  Create 3 divs with common class namme "box" and Access them some unique text each of them;
let idx = 1;
let divs = document.querySelectorAll(".box");
//console.dir(divs);

for(let div of divs){
    div.innerText = `New unique Value ${idx}`;
    idx++;
}