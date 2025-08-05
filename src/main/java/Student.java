package org.example;

public class Student {


    //CONSTRUCTOR

    Student()
    {
        System.out.println("calling constructor-default");
    }

    Student(String name,int age)
    {
        this.name=name;
        this.age=age;
        System.out.println("calling constructor-parametererised");
    }

    Student(Student s)
    {
        this.name=s.name;
        this.age=s.age;
        System.out.println("calling constructor-copy");
    }

    public void printName(String name)
    {
        System.out.println("Name is "+" "+name);
    }

    //METHOD OVERLOADING-Either different return type for methods or different method signature.This is also called compile time polymerphism

    public void printBoth(String name,int age)
    {
        System.out.println("Name is "+" "+name+" "+"age is "+" "+age);
    }


    String name;
    int age;

    public void printDetails()
    {
        System.out.println(this.name+ " "+this.age);
    }
}
