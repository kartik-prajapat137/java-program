// Q1.> Create A new button with the help of js;

let newBtn = document.createElement("button");
newBtn.innerText = ("Button");
console.log(newBtn);

// Get Accessed New Button ;
let div = document.querySelector("div");
div.append(newBtn);
//1.>div.prepend(newBtn);
//2.>div.before(newBtn);
//3.>div.after(newBtn);

//Q2.> Create New Heading in JS;
let newHeading = document.createElement("h1");
newHeading.innerHTML = "<i> Hi I Am KARTIK prajapat </i>";

let body = document.querySelector("body");
body.prepend(newHeading);

//Q3.> Delete Elements with the help of js;

// div.remove(); 