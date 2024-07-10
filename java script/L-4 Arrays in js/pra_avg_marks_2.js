// Q1. Find Average marks of students; 
let marks =[85,97,44,37,76,60];

let sum = 0;

// for(let mark of marks){
//     sum += mark;
// }

for(let i=0; i<marks.length; i++){
    sum += marks[i];
}
let avg = sum/marks.length;

console.log(avg,"\n\n");

// Q2. 10% off an array;

let items = [250,645,300,900,50];
let i=1;
for(let item of items){
    console.log(`value of item ${i} = ${item} `);

    let val = item/10;
    item = item-val;
    console.log(`value of item after offer is  = ${item}`);
    i++;
}