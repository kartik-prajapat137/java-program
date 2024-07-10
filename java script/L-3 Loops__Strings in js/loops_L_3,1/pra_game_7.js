// game is guess number;

let gameNum =25;
let userNum = prompt("Guess the no is under 1 to 100");

while(userNum != gameNum){
   userNum = prompt("You Guess Wrong Number, Try Again");
}
console.log("Congratulations You Entered Right Nmber");