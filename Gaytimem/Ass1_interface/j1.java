// @1. Write a Java program to create an interface Shape with the great method. Create three classes Rectangle, Circle, and Triangle that mom the Shape interface. Implement the gelAresti method for each of the three classes

package Gaytimem.Ass1_interface;

interface Shape{
    public void  Area_Rectangle();
    // public void  Area_Circle();
    // public void  Area_Traingle();
    default void  shapes(){
        System.out.println("shape");
    }
}
class Rectangle implements Shape{
    public void Area_Rectangle(){

    }
}
class Circle {
    
}
class Triangle {
    
}

public class j1 {
    
}
