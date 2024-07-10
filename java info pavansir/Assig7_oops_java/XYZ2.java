class Student {
    int rollno;
    double percentage;

    // Default constructor
    Student() {
        rollno = 0;
        percentage = 0.0;
    }

    // Parameterized constructor
    Student(int rollno, double percentage) {
        this.rollno = rollno;
        this.percentage = percentage;
    }

    // Method to display student information
    void show() {
        System.out.println("Roll No: " + rollno);
        System.out.println("Percentage: " + percentage);
    }
}

class CollegeStudent extends Student {
    int semester;

    // Default constructor
    CollegeStudent() {
        super();
        semester = 1;
    }

    // Parameterized constructor
    CollegeStudent(int rollno, double percentage, int semester) {
        super(rollno, percentage);
        this.semester = semester;
    }

    // Overriding show method
    @Override
    void show() {
        super.show();
        System.out.println("Semester: " + semester);
    }
}

class SchoolStudent extends Student {
    String classname;

    // Default constructor
    SchoolStudent() {
        super();
        classname = "10th";
    }

    // Parameterized constructor
    SchoolStudent(int rollno, double percentage, String classname) {
        super(rollno, percentage);
        this.classname = classname;
    }

    // Overriding show method
    @Override
    void show() {
        super.show();
        System.out.println("Class: " + classname);
    }
}

public class XYZ2 {
    public static void main(String[] args) {
        Student[] students = new Student[5];

        // Creating CollegeStudent objects
        students[0] = new CollegeStudent(1, 85.0, 2);
        students[1] = new CollegeStudent(2, 78.0, 4);

        // Creating SchoolStudent objects
        students[2] = new SchoolStudent(3, 90.0, "12th");
        students[3] = new SchoolStudent(4, 65.0, "10th");
        students[4] = new SchoolStudent(5, 80.0, "11th");

        // Display all records
        System.out.println("All Student Records:");
        for (Student student : students) {
            student.show();
            System.out.println();
        }

        // Search record based on rollno
        int searchRollNo = 3;
        boolean found = false;
        for (Student student : students) {
            if (student.rollno == searchRollNo) {
                found = true;
                System.out.println("Record found:");
                student.show();
                if (student instanceof CollegeStudent) {
                    System.out.println("The student is a CollegeStudent.");
                } else if (student instanceof SchoolStudent) {
                    System.out.println("The student is a SchoolStudent.");
                }
                break;
            }
        }
        if (!found) {
            System.out.println("Record with roll number " + searchRollNo + " not found.");
        }

        // Count how many students are having A grade (percentage > 75)
        int countAGrade = 0;
        for (Student student : students) {
            if (student.percentage > 75) {
                countAGrade++;
            }
        }
        System.out.println("Number of students having A grade: " + countAGrade);
    }
}
