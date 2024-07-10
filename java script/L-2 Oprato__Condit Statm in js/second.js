// Arthmatic Operators in js.
// ( +, -, /, *, %, ** ).

let a = 5;
let b = 2;

console.log("a+b=",a+b);
console.log("a-b=",a-b);
console.log("a*b=",a*b);
console.log("a/b=",a/b);
console.log("a%b=",a%b);
console.log("a**b=",a**b);

// Assignment Operators in js.
//a+=1 == a=a+1. ( +=, -=, /=, *=, %=, **=).

let x = 5;
let y = 2;

console.log();
console.log("a+=1",x+=b);
console.log("a-=1",x-=y);
console.log("a*=2",x*=y);
console.log("a/=2",x/=y);
console.log("a%=2",x%=y);
console.log("a**=2",x**=y);

// comparision Operators in js.
// ( ==, !=, ===, !==, <, >).

let p = 5;
let q = 2;
let c ="5";

console.log();
console.log("a==b",a==b);
console.log("a!=b",a!=b);
console.log();
console.log("a===b",a===c);
console.log("a!==b",a!==c);
console.log();
console.log("a<b",p>q);
console.log("a>b",p<q);

// Logical Operators in js.
// ( &&, ||, !) .{ ! = change true into false and false in to true }. 

let r=5;
let t=3;

let cond1 = r>t;
let cond2 = r==t;

console.log();
console.log("a && b",cond1 && cond2);
console.log("a || b",cond1 || cond2);
console.log("!(r>t)",!(r>t));

// Conditional Statements.
// (if, else, else if, ).

//if.
//else.

let u = 2;
let v = 5;

console.log();
if(u===v) {
    console.log("equal");
}if(u!==v) {
    console.log("not equal");
}if(u<v){
    console.log("u are less than v. ");
}else{
    console.log("not defind");
}

// else if.

console.log();
if(u<v){
    console.log("u is greater");
}else if(u>v){
    console.log("v is greater");
}else{
    console.log("not dfined");
}

// turnery Operator .
// ( condition ? true output : false output; ).

console.log();
let age = 20;

age >= 18 ? console.log("Adult"): console.log("Not Adult");


// practice Q.1 using prompt. number is multiple of 5 or not.

console.log();
let input = prompt("Enter a number");

if(input % 5 === 0){
console.log(input,"is a multiple of 5");
}else{
console.log(input,"is not multiple of 5");
}

//pactice Q.2 .give grade of student.
//06/01/24 3:30 to 04:41 PM is done by kp.

console.log();

let score = prompt("Enter the marks (1 t0 100):");
let grade;

if(score >=90 && score <=100){
    grade="A";
}else if(score >=70 && score <=89){
    grade="B";
}else if(score >=60 && score <=69){
    grade="C";
}else if(score >=50 && score <=59){
    grade="D";
}else if(score >=0 && score <= 49){
    grade="FF";
}else{
    grade="wrong marks enterd"
}
console.log("According to your markes your grade is",grade);