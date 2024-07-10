let modebtn = document.querySelector("#mode");
let mode = "light";
let body = document.querySelector("body");

modebtn.addEventListener( "click",() =>{
    if(mode == "light"){
        console.log("dark");
        mode = "dark";
        // document.querySelector("body"). style.backgroundColor = "black";
        body.classList.add("dark");
        body.classList.remove("light");
    }else{
        console.log("light");
        mode = "light";
        // document.querySelector("body").style.backgroundColor ="white";
        body.classList.add("light");
        body.classList.remove("dark");
    } 
})