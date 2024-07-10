//7)Create three classes  Faculty  (facultyid, salary), FullTimeFaculty  (basic, allowance) inherits class Faculty, PartTimeFaculty  (hour, rate) inherits class Faculty. 
//  Create   a   method   for   accepting   input   in   FullTimeFaculty       and  PartTimeFaculty,  but   salary  should   not   be   accepted.    salary   is  calculated   on   the   basis   of   (basic+allowance)   for   FullTimeFaculty   and  (hour*rate)   for   PartTimeFaculty.   Also   create   method   in   above   classes   to  display faculty data. 
//  Create   another   class(say   XYZ)   for   main   method   and   store   2 fulltime and 2 parttime faculty information. Also print their details. 



class Faculty {
    int facultyId;
    double salary;

    public Faculty(int facultyId) {
        this.facultyId = facultyId;
        this.salary = 0.0;  // Initial salary is set to 0.0
    }

    // Method to display faculty data
    public void display() {
        System.out.println("Faculty ID: " + facultyId);
        System.out.println("Salary: " + salary);
    }
}

class FullTimeFaculty extends Faculty {
    double basic;
    double allowance;

    public FullTimeFaculty(int facultyId, double basic, double allowance) {
        super(facultyId);
        this.basic = basic;
        this.allowance = allowance;
        calculateSalary();
    }

    // Method to calculate salary
    private void calculateSalary() {
        this.salary = basic + allowance;
    }

    // Method to accept input (simulated with constructor in this case)
    public void acceptInput(double basic, double allowance) {
        this.basic = basic;
        this.allowance = allowance;
        calculateSalary();
    }

    // Method to display faculty data
    @Override
    public void display() {
        super.display();
        System.out.println("Basic: " + basic);
        System.out.println("Allowance: " + allowance);
    }
}

class PartTimeFaculty extends Faculty {
    int hour;
    double rate;

    public PartTimeFaculty(int facultyId, int hour, double rate) {
        super(facultyId);
        this.hour = hour;
        this.rate = rate;
        calculateSalary();
    }

    // Method to calculate salary
    private void calculateSalary() {
        this.salary = hour * rate;
    }

    // Method to accept input (simulated with constructor in this case)
    public void acceptInput(int hour, double rate) {
        this.hour = hour;
        this.rate = rate;
        calculateSalary();
    }

    // Method to display faculty data
    @Override
    public void display() {
        super.display();
        System.out.println("Hours: " + hour);
        System.out.println("Rate: " + rate);
    }
}

    public class XYZ {
        public static void main(String[] args) {
            // Create 2 FullTimeFaculty objects
            FullTimeFaculty fullTime1 = new FullTimeFaculty(101, 50000, 10000);
            FullTimeFaculty fullTime2 = new FullTimeFaculty(102, 60000, 15000);
    
            // Create 2 PartTimeFaculty objects
            PartTimeFaculty partTime1 = new PartTimeFaculty(201, 20, 500);
            PartTimeFaculty partTime2 = new PartTimeFaculty(202, 25, 600);
    
            // Display information of FullTimeFaculty
            System.out.println("Full Time Faculty 1 Information:");
            fullTime1.display();
            System.out.println();
    
            System.out.println("Full Time Faculty 2 Information:");
            fullTime2.display();
            System.out.println();

            fullTime2.acceptInput(100000, 2000);
            System.out.println("Full Time Faculty 22 Information:");
            fullTime2.display();
            System.out.println();
    
            // Display information of PartTimeFaculty
            System.out.println("Part Time Faculty 1 Information:");
            partTime1.display();
            System.out.println();
    
            System.out.println("Part Time Faculty 2 Information:");
            partTime2.display();
        }
    }
    
