let marks=[94,43,44,56,75,86];
console.log(marks);
marks[2]=95;
console.log("\n",marks);

// For loops in Array.

for(let i=0; i<marks.length; i++){
    console.log(marks[i]);
}

// for of loop.
let cities =[ "indore","mumbai","ahemdabad","pune","surat","raigad","jaypur"];
for(let city of cities){
    console.log(city.toUpperCase());
}



