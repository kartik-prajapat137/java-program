// 17) Create a class Employee with(empNo ,salary and totalSalary)  with following 	features.
// Only parameterized constructor;
// totalSalary always represent total of all the salaries of all employees created.
// empNo should be auto incremented.
// display total employees and totalSalary using class method.


import java.util.Scanner;

class employee{
    int n=5;
    private int[] empNo = new int[n];
    private int empId[]= new int[n];
    private int empSallary[]=new int[n];
    private int empTotalSa=0;

    public employee(int[] empNo,int[] empSallary,int empId,int n){
        for (int i=0; i<n; i++) {
            this.empNo[i]= empNo[i];
      
       this.empSallary[i]= empSallary[i];
       this.empTotalSa+=empSallary[i];
     
        this.empId[i]= empId;
        empId++;
      }
    }
    
    public void empData(){
        System.out.println("empNo    empId    empSallary");
        for (int i=0; i<empId.length; i++) {
            System.out.println(empNo[i]+"\t"+empId[i]+"\t"+empSallary[i]);
        }
        System.err.println("Total Emp SAlary is : "+empTotalSa);
    }
}
public class j17_employee_total_S {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter NO. of member ");
        int n = sc.nextInt();
        System.out.println("Enter employee name :");
        int[] empNo = new int[n];
        for (int i=0; i<n; i++) {
              empNo[i]= sc.nextInt();
        }System.out.println("Enter employee Salary :");
        int[] empS = new int[n];
        for (int i=0; i<n; i++) {
            empS[i]= sc.nextInt();
      }System.out.println("Enter first employyee Id :");
        int empId = sc .nextInt();
        employee obj = new employee(empNo,empS,empId,n);
        obj.empData();
    }
}