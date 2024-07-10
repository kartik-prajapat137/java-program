// inheritance . 
class person  {
    constructor(branch) 
    {
        this.species = "homo sapiens";
        this.branch = branch;
    }
    eat(){
        console.log("eat");
    }
    sleep(){
        console.log("sleep");
    }
    work(){
        console.log("work");
    }
}

class Engineer extends person {
    //Super Keyword
    constructor(branch){
        super(branch);  //to invoke parent class constructor.
        this.branch = branch;
    }
    work(){
        super.eat();
        console.log("we are not working"); //chiled class overid parent class  {heavy on parent class}
    }
}

class Doctor extends person { 
    treatment(){
        console.log("Treatment by Doctor k.");
    }
}

let kartikobj = new Engineer(); // type kartikobj.eat();

//Super Keyword :-
let engobj = new Engineer("chimical eng");