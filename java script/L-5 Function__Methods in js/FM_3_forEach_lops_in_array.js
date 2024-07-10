let arr = [1,2,3,4,5];

arr.forEach(function printval(val){
    console.log(val,"\n\n");
});

// ArrowFunction Arr

 let arr2 =["indorE","mumbai","kolkatta","chennai","bengluru","andrapadeSh"]
arr2.forEach((val,idx) => {
    console.log(val.toUpperCase(),idx,arr2); // we can use three parameters in this methods:
});

// make program to print square of no's with the help of ForEach Loop.

let num = [2,23,343,4,34,34,];

num.forEach((num) => {
    console.log(num*num);
});

// second type use of ForEach loop in Functions:

let calculate  = (num) => {
    console.log(num*num);
};

num.forEach(calculate);

// MAP METHOD Arr;
// map Array Function is used to for new array, using some returned value based on each value 
// -whis is stored in the indivisual indises of the array;

let nums = [63,83,43,38];

let newArr = nums.map((val) =>{
    return val*2;
})
console.log(newArr);

// Filter mathod Arr;
// this arr are used to for create new arr and get filtered ith new conditions;
//{Only True Vale Stored in New Arr}

let arr3 = [1,2,3,4,5,6,7,8,9,10];

let evenarr = arr3.filter((val) =>{

    return val > 5;
});

console.log("\n\n",evenarr);

// Reduce Mthod Arr;
// REduce Method reduce Array  to Gives We Only One Value;

let arr4 = [1,2,3,4];

let output = arr4.reduce((res,curre) => {
   //return res + curre; // sum of tatal no.
   return res > curre ? res : curre; // greatest value of the them;'
});

console.log(output);