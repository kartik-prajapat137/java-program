@FunctionalInterface
interface StringProcessor {
    void process(String str);
}


public class LambdaMethodReferenceExample {

    // A static method that converts a string to uppercase and prints it
    public static void printUpperCase(String str) {
        System.out.println(str.toUpperCase());
    }

    public static void main(String[] args) {
        // Using a method reference
        StringProcessor processor = LambdaMethodReferenceExample::printUpperCase;

        // Calling the process method
        processor.process("hellO@");
    }     
}
