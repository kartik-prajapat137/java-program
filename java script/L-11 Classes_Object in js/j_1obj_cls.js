//1.> Basics of objects and classes;
const student = {
    name : "kartik prajapat",
    marks: 94.9,
    printMarks() {
        console.log("marks =", student.
        marks)
    },
};

//2.>
const employee = {
    calcTax() {
        console.log("Calculated Tax is 10%");
    },
};


const kartik = {
    salary: 5000,
};

// inharit function empl class to kartik;
//example :- kartik.calctax();
kartik.__proto__ = employee;
