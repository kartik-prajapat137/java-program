let Data = "secret Data";
class user {
    constructor(name,email){
        this.name =name;
        this.email = email;
    }
    viewData(){
        console.log("website data");
    }
}

let student1 = new user("kartik", "kar@gmail.com")
let student2 = new user("sanjay", "sanjay@gmail.com")
