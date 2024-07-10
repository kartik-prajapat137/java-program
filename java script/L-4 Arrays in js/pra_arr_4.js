// Q.1 1>.remove from starting, 2>. Uber change into Ola, 3>.Add Amzon in starting;
let company = ["Bloomberg","Microft","Uberr","Google","IBM","Netflix"];

console.log(company);
console.log(company.shift());
console.log(company);
company.splice(2,1,"Ola");
console.log(company);
company.push("Amazon");
console.log(company);

