import java.util.Scanner;

abstract class Processor {
    int data;

    // Method to display data value
    void showData() {
        System.out.println("Data: " + data);
    }

    // Abstract method to define processing of member data
    abstract void process();
}

class Factorial extends Processor {
    // Constructor to set data
    Factorial(int data) {
        this.data = data;
    }

    // Overriding the process method to calculate factorial
    @Override
    void process() {
        long factorial = 1;
        for (int i = 1; i <= data; i++) {
            factorial *= i;
        }
        System.out.println("Factorial of " + data + " is: " + factorial);
    }
}

class Circle extends Processor {
    // Constructor to set data
    Circle(int data) {
        this.data = data;
    }

    // Overriding the process method to calculate area of a circle
    @Override
    void process() {
        double area = Math.PI * data * data;
        System.out.println("Area of circle with radius " + data + " is: " + area);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your choice (1 for Factorial, 2 for Circle Area): ");
        int choice = scanner.nextInt();

        System.out.println("Enter the data value: ");
        int data = scanner.nextInt();

        Processor processor;

        switch (choice) {
            case 1:
                processor = new Factorial(data);
                break;
            case 2:
                processor = new Circle(data);
                break;
            default:
                System.out.println("Invalid choice.");
                return;
        }

        processor.showData();
        processor.process();
    }
}
