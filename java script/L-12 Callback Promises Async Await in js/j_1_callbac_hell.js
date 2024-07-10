// synchronous .
console.log("one");

setTimeout( () =>{
    console.log("hello");
},4000) // 4s. = 4000 ms.

console.log("two");

// Callback ;
function sum(a,b) {
    console.log(a+b);

}

function calculator(a,b,sum) {
    sum(a,b);    
}

calculator(1,2,sum);

// Callback Hell.   

function getData(getdata, getnextdata){
    setTimeout(() => {
    console.log("data =",getdata);
    getnextdata();
    },2000)
}

getData(1,() => {
    console.log("getting data 2 ....");
    getData(2, () =>{
    console.log("getting data 3 ....");
      getData(3, () => {
    console.log("getting data 4 ....");
         getData(4);

      });
    });
});
