// Pra 1.
// filter Out 90 above marks;

let arr = [87,45,90,56,67,97,97,69,94];

let Abovem = arr.filter((marks) => {
    return marks > 90;
});

console.log(Abovem)

// Pra 2.
// input from user , create an array 1 to n no. ,
//,Use Reduce Methode Some of All in Array , Use Reduce Methood the Product of AllArray;

let input = prompt("Enntera Number");

let arr2 = [];
for(let i=1; i<=input; i++){
    arr2[i-1] = i;
}

console.log(arr2);
let sum = arr2.reduce((preves,current) =>{
    return preves+current;
});

console.log("sum =",sum)

let factorial = arr2.reduce((preves,current) =>{
    return preves*current;
});

console.log("factorial =",factorial);