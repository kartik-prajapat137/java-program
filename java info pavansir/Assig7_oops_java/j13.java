// 13) Explain the importance of toString() and equals() method of the Object class and override them on class Employee (empId,name,salary).
// Create class for main method(say XYZ),and accept five employees information and store in an array. Also ensure if entered empId already exist or not (use equals method).
// Display all employee info using toString() method.

import java.util.Scanner;

class Employee22 {
    int empId;
    String name;
    double salary;
    Employee22(){
        this.empId=0;
        this.name=" ";
        this.salary=0.0;
    }
    Employee22(int empId, String name, double salary){
        this.empId=empId;
        this.name=name;
        this.salary=salary;
    }
     int check(int empId){
        if(this.empId==empId){
            return 1;
        }
        return 0;
    } 


}
public class j13 {
    public static void main(String[] args) {
        Employee22 emp2 = new Employee22();
        Employee22[] emp = new Employee22[3];
        Scanner sc = new Scanner(System.in);
        System.out.println("storing 5 Employees info : ");
        // int n = sc.nextInt();

        boolean flag = false;

        for(int i=0; i<3; i++){
            flag = false;
        System.out.print("Enter Emp Id : ");
        int empId = sc.nextInt();
        for(int j=0; j<i; j++){
           if(emp[j].check(empId)==1){
            --i;
            flag=true;
            System.out.println("Please enter unique id this id is exist :");
            continue;
           }
        }
        if(flag)
        continue;

        System.out.print("Enter Name : ");
        String name = sc.next();
        System.out.print("Enter Salary : ");
        double salary = sc.nextDouble();

        emp[i] = new Employee22(empId, name, salary);
        }

        System.out.println("\nEmployee Details : ");
        for(Employee22 empe : emp){
            System.out.println("Name: "+empe.name);
            System.out.println("EmpID:"+empe.empId);
            System.out.println("Emp Salary: "+empe.salary);
        }
        
    }
}
