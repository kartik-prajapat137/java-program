// 7) Create three classes  Faculty  (facultyid, salary), FullTimeFaculty  (basic, allowance) 
// inherits class Faculty, PartTimeFaculty  (hour, rate) inherits class Faculty. 
// Create   a   method   for   accepting   input   in   FullTimeFaculty       and 
// PartTimeFaculty,  but   salary  should   not   be   accepted.    salary   is  calculated   on   the   basis   of 
// (basic+allowance)   for   FullTimeFaculty   and  (hour*rate)   for   PartTimeFaculty.   Also   create   method  
//  in   above   classes   to  display faculty data. 
// Create   another   class(say   XYZ)   for   main   method   and   store   2 fulltime and 2 parttime faculty information.
// Also print their details. 
class Faculty1{
     int facultyid;
     int salary;
    Faculty1(int facultyid){
        this.facultyid=facultyid;
        this.salary=0;
    }
    
    public void Display(){
        System.out.println("Facultyid : "+facultyid);
        System.out.println("Facultyid : "+salary);
    }
}
class FullTimeFaculty1 extends Faculty1{
      int basic;
      int allowance;
   public FullTimeFaculty1(int facultyid, int basic, int allowance){
        super(facultyid);
        this.basic=basic;
        this.allowance=allowance;
        calculation();
    }
    private void calculation(){
        this.salary=basic+allowance;
    } 
    @Override
    public void Display(){
        super.Display();
        System.out.println("Basic : "+basic);
        System.out.println("Allowance : "+allowance);
    }
}
class PartTimeFaculty1 extends Faculty1{
    private int hour;
    private int rate;
    public PartTimeFaculty1(int facultyid, int hour, int rate){
        super(facultyid);
        this.hour=hour;
        this.rate=rate;
        calculation();
    }
    private void calculation(){
        this.salary=hour*rate;
    }
    @Override
    public void Display(){
        super.Display();
        System.out.println(" Hour : "+hour);
        System.out.println(" Rate : "+rate);
    }
}

public class j7_Faculty {
    public static void main(String[] args) {
        System.out.println();
        FullTimeFaculty1 fullF1 = new FullTimeFaculty1(101,50000,4000);   
        fullF1.Display();
        System.out.println();
        PartTimeFaculty1  partF1 = new PartTimeFaculty1(103, 5, 400);
        partF1.Display();
    } 
}
