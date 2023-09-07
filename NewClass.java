/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class NewClass NHERITANCE
package javaapplication1;

/**
 *
 * @author 22cseb58
 */
import java.util.*;


public class JavaApplication1 {
    public static void main(String[] args){
        Mamals obj = new Mamals();
        obj.cat();
        obj.Dog1();
        obj.Dog2();
    }    
    }    
   
class Animal{
    Animal(){
    String name = "Animals-->Mamals";
    System.out.println(name);
    }
}
class Mamals extends Animal{
    void cat(){
        System.out.println("Meow");
    }
    void Dog1(){
        System.out.println("Woof");
    }
    void Dog2(){
        System.out.println("Woooof");
    }
}




// SHAPE
package javaapplication2;

/**
 *
 * @author 22cseb58
 */
import java.util.*;
public class JavaApplication2 {
    public static void main(String[] args) {
        circle c = new circle(5.0);
        rectangle r = new rectangle(5.0,2.0);
        System.out.println("Area of Circle: "+c.calculateArea());
        System.out.println("Area of Rectangle: "+r.calculateArea());
    }
}
class shape{
    double claculateArea(){
        return 0.0;
    }
}
class circle extends shape{
    private double radius;
    circle(double radius){
        this.radius = radius;
    }
    double calculateArea(){
        return Math.PI*radius*radius;
    }
    public String tostring(){
        return "Area of Circle: "+calculateArea();
    }
}
class rectangle extends shape{
    private double length;
    private double width;
    rectangle(double length,double width){
        this.length = length;
        this.width = width;
    }
    double calculateArea(){
        return length*width;
    }
    public String tostring(){
        return "Area of Rectangle: "+calculateArea();
    }
}

    
}
