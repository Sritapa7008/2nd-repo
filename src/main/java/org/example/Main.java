package org.example;
import java.util.*;





import org.example.Rectangle;

public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");
        Pen p1= new Pen();
        p1.color="Red";
        p1.type="gel";
        p1.write();

        Pen p2= new Pen();
        p2.color="black";
        p2.type="ball";
        p2.write();

        p1.printcolor();
        p2.printcolor();

        Student s1= new Student("Rani",22);


        s1.printDetails();

        Student s2= new Student();
        s2.name="bani";
        s2.age=12;
        s2.printDetails();

        Student s3= new Student(s2);
        s3.printDetails();

        s2.printName("bani");
        s2.printBoth("bani",12);
        Rectangle R1=new Rectangle();
        R1.colour="blue";//inhering variable
        R1.length=10;
        R1.breadth=20;
        R1.area(10,20);//single inheritance

        Square q=new Square();
        q.length=20;
        q.area(20);//multilevel inheritance

        Circle c=new Circle();
        c.length=20;
        c.area(20);//heirarchal inheritance
        //both circle and rectangle are child classes of color class;


    }
}