// 4. for-of loop;

let str = "kartik";

let size  = 0;
for(let i of str) {
    console.log("i=",i);
    size = size+1;
}
console.log("size of string =",size);

// 5. for-in loop;
console.log();
console.log();

let student ={
    name: "kartik prajapat",
    age: 20,
    cgpa: 7.3,
    isPass: true,
};

for (let i in student) {
    console.log("i=",i,"value=", student[i]);
    console.log( typeof student[i]);
}