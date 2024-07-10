// Fetch API (Application programing interface).
 let pera = document.querySelector(".pera");
 let btn = document.querySelector("#btn");

const URL = "http://cat-fact.herokuapp.com/facts";

// const getFact = async() => {
//     console.log("Loading....");
//     let response = await fetch(URL);
//     console.log(response); // json format .
//     let data = await response.json();// json are used to convert coad into text print in page. 
//     console.log(data[4].text);
//     pera.innerText = data[0].text;
// }

function getFact(){
    fetch(URL)
    .then((response) => {
       return response.json();
    }).then((data) => {
        console.log(data);
        pera.innerText = data[0].text;
    });
};

btn.addEventListener("click",getFact);