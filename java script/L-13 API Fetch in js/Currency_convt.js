const dropdowns = document.querySelector(".dropdown select");

for(let select of dropdowns){
    for(let coad of countryList[code]){
        let newOption = document.querySelector("option");
        newOption.innerText =currcode;
        newOption.value = currcode;
        select.append(newOption);
    }
}