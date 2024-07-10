// 0. string;
let fooditems = ["apple","banana","papaya","patato","mango"];
console.log(fooditems);

// 3. Array convert in to String;
console.log(fooditems.toString());

// 1. Add items in array from end;
fooditems.push("kivi","graps","lichi");
console.log(fooditems)

// 2. Delet items in arrays from end and return;
let deleteditems = fooditems.pop();
console.log(fooditems)

console.log("deketeditems = ",deleteditems,"\n\n");

// 4.joins multiple array & returns;
let southheroes = ["ajay","allu","prabhas","shubhasbabu"];
let holywoodheroes = ["RItik Roshan","AjayDevagan","ViduyutJamval","ShaharukhKhan"];
let bolywoodheroes = ["thor","ironman","spiderman","superman","badman"];

let heroes = southheroes.concat(holywoodheroes,bolywoodheroes);

console.log(heroes);

// 5. Unshift(); Are used to add elements from Start ;

southheroes.unshift("vijayDevconda");
console.log(southheroes);

// 6. shift(); Are used to delet an elements form starting & return ;

holywoodheroes.shift();
console.log(holywoodheroes);

// 7. slice(): Are used to pice an elements of array ;

console.log(bolywoodheroes.slice(1,3));

// 8. splice(): Are used to an element add,remove,replace ;

let arr = [1,2,3,4,5,6,7,8,];
 arr.splice(4,2,10,20);   //add,delet,place;
 console.log(arr);

 arr.splice(3,0,35);      //add;
 console.log(arr);

 console.log(arr.splice(3));