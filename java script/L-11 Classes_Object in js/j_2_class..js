// Classes.
class Toyotacar {

// Constructor. 
constructor(brand,mileage){
    console.log("Creating your object");
    this.brand = brand;
    this.mileage = mileage;
//Class.
    
}
    start() {
        console.log("start");
    }
    stop() {
        console.log("stop");
    }
        setBrand(brand) {
            this.brand = brand;
        }
}

let Fortuner = new Toyotacar();
Fortuner.setBrand("Fortuner");

let lexus = new Toyotacar("lexus",12);