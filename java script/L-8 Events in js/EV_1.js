//2.> Event Heandling in js.
let btn1 =document.querySelector("#btn1");
//* Event object = (evt).
btn1.onclick = (evt) => {
    console.log("This is btn");

    console.log(evt);
    console.log("event type =",evt.type);
    console.log("event target =",evt.target);
    console.log("event X & Y =",evt.clientX , evt.clientY); 
}
let div = document.querySelector("div");
div.onmouseover = () =>{
    console.log("You Are Inside Div");
}

// 3.> Event Heandling.
// multiple works we are heandle in one event. 

let btn2 = document.querySelector("#btn2");
btn2.addEventListener("click", (evt) =>{
    console.log("btn2 was clicked");
    console.log(evt);
    console.log("event type =",evt.type);
    console.log("event target =",evt.target);
    console.log("event X & Y =",evt.clientX , evt.clientY); 

})
btn2.addEventListener("click", () =>{
    console.log("btn2 was clicked auto print second event in one evt");
})

// node.removeEventListener aaaa (evt , callback)

let btn3 = document.querySelector("#btn3");
 btn3.addEventListener("click",() =>{
    console.log("hendeler-1")
 })
 btn3.addEventListener("click",() =>{
    console.log("hendeler-2")
 })

 const callback = () =>{
    console.log("hendeler-3")
 }
 btn3.addEventListener("click",callback);

 btn3.addEventListener("click",() =>{
    console.log("hendeler-4")
 })
 // remove.
 btn3.removeEventListener("click", callback);