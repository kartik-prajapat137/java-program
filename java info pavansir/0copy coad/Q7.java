/*Explain the importance of toString() and equals() method of the Object class and override them on class Employee (empId,name,salary).
Create class for main method(say XYZ),and accept five employees information and store in an array. Also ensure if entered empId already exist or not (use equals method).
Display all employee info using toString() method.
*/
import java.util.Scanner;
class Employee {
    private int empId; 
    private String name  ; 
    private int salary ;
    public Employee(int empId , String name , int salary){
        this.empId = empId;
        this.name  = name ; 
        this.salary= salary;
    }

    public String toString(){
        // String isDuplicate = (equals([]recordStudents,empId) ? "Duplicate" : "Not duplicate");
        return "Employee id -: "+ empId + " Name -: "+ name +" Salary -: "+salary+ " Is Duplicate Or Not -: "+ isDuplicate;
        }

    public boolean equals(Object obj){
      if(this == obj){
        return true;
      }
      if(obj == null || getClass() != obj.getClass()){
        return false;
      }
      Employee employee = (Employee) obj ;
      return empId == employee.empId;
        }
 }

public class Q7{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        Employee obj   = new Employee(1 , "Atul" , 65000);
        Employee obj1  = new Employee(2 , "Atul" , 55000);
        Employee obj2  = new Employee(3 , "Atul" , 85000);
        Employee obj3  = new Employee(4 , "Atul" , 65000);
        Employee obj4  = new Employee(1 , "Atul" , 45000);
        Employee arr[] = new Employee[5];
        arr[0] = obj;
        arr[1] = obj1;
        arr[2] = obj2;
        arr[3] = obj3;
        arr[4] = obj4;
        boolean isDuplicate = false ; 
        for(int i = 0 ; i < 4 ; i++){
            if(employee[i].equals(new Employee)){
                isDuplicate = true;
                break;
            }
        }
          if (isDuplicate) {
                System.out.println("Duplicate Employee ID! Please enter a unique ID.");
            } else {
                employees[empCount] = newEmployee;
                empCount++;
            }
           for(Employee emp : arr){
            System.out.println(emp);
           }
        }
    }
