class A{
    private static String Name ;
    private static int empNo=0;
    private static int empId=2000;
    private static int empSallary;
    private static int totalSalary=0;
    public A(String Name ,int empSallary){
        this.Name= Name;
        this.empSallary=empSallary;
        this.empNo++;
        this.empId++;
        this.totalSalary+=empSallary;
    }
    public void Display(){
        System.out.println(empNo+"\t"+empId+"\t"+Name+"\t"+empSallary);
    }
   public void DisplayTS(){
        System.out.println("\nEmployee Total Sallary is : "+totalSalary);
    }
}
public class j17_2_employee {
    public static void main(String[] args) {
        System.out.println("empNo.\tmpId\tName\tEmpSallary");
        A obj = new A("kartik ", 5000);
        obj.Display();
        A obj2 = new A("Ritik ", 15000);
        obj.Display();
        A obj3 = new A("Hemangt ", 25000);
        obj.Display();

        obj2.DisplayTS();
    }
}
