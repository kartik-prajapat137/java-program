// Functions in js.
function myFunction(){
    console.log("Welcome to in Functions & methods");
    console.log("We are learnig Functions and Methods")
}
myFunction();

function adding(msg){
    console.log(msg);
}
adding(4+5);

function sum(x,y){
    let s = x+y;
    return s;

}
let val = sum(18,26);
console.log(val)

// Arrow Function in js.

const Arrowsum = (x,y) => {
    let v = x*y;
    console.log(v);
    return v;
}
let v = Arrowsum(10,12);
console.log(v);