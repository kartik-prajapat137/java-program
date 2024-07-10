// 12) Create Interface Taxable with members salesTax=7% and incomeTax=10.5%. 	Create abstract method calcTax().
// Create class Employee(empId,name,salary) and implement Taxable to calculate incomeTax on yearly salary.
// Create class Product(pid,price,quantity) and implement Taxable to calculate salesTax on unit price of product.
// Create class for main method(Say XYZ), accept employee information and a product information from user and print income tax and sales tax respectively.


interface Taxable {
    double salesTax = 7;
    double incomeTax = 10.5;
    void calcTax();

}
class Employee implements Taxable {
    String name;
    int empId;
    double salary;
    
    Employee( String name,int empId, double salary){
        this.name=name;
        this.empId=empId;
        this.salary=salary;
    }
    
    public void calcTax(){
        double Tax = ((salary*12)*incomeTax)/100;
        System.out.println("Name : "+name);
        System.out.println("Employee Id : "+empId);
        System.out.println("Salary Monthly : "+salary);
        System.out.println("yearly 10.5/ Salary Tax : "+Tax);
    }
}

class Product implements Taxable {
    double pid;
    double price;
    double quantity;
    
    Product(double pid, double price, double quantity) {
        this.pid=pid;
        this.price=price;
        this.quantity=quantity;
    }

    public void calcTax(){
        double Tax = ((price*quantity)*salesTax)/100;
        System.out.println("Product id : "+pid);
        System.out.println("Product price : "+price);
        System.out.println("Product quantity : "+quantity);
        System.out.println("Sales Tax on Total Product : "+Tax);
    }
}
public class j12Tax {
    public static void main(String[] args) {
       Taxable emp = new Employee("kartik", 100, 25000);
       emp.calcTax();
       Taxable product = new Product(2001, 125, 12);
       product.calcTax();
    }
}
