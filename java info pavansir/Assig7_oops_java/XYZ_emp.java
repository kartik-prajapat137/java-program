// Employee.java
import java.util.Scanner;

class Employee {
    private int empId;
    private String name;
    private double salary;

    public Employee(int empId, String name, double salary) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
    }

    // Getter methods
    public int getEmpId() {
        return empId;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Employee employee = (Employee) o;

        return empId == employee.empId;
    }

    @Override
    public int hashCode() {
        return empId;
    }
}

//
// XYZ.java

public class XYZ_emp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Employee[] employees = new Employee[5];
        int count = 0;

        while (count < 5) {
            System.out.println("Enter employee details:");

            System.out.print("Enter empId: ");
            int empId = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            boolean exists = false;
            for (int i = 0; i < count; i++) {
                if (employees[i].equals(new Employee(empId, "", 0))) {
                    exists = true;
                    break;
                }
            }

            if (exists) {
                System.out.println("Employee with empId " + empId + " already exists. Please enter a unique empId.");
                continue;
            }

            System.out.print("Enter name: ");
            String name = scanner.nextLine();

            System.out.print("Enter salary: ");
            double salary = scanner.nextDouble()

            employees[count++] = new Employee(empId, name, salary);
        }

        System.out.println("\nEmployee Details:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }

        scanner.close();
    }
}

