import java.io.IOException;
import java.sql.SQLException;
import java.util.*;

public class task {
}

class Demo
{

    public static void main (String[]args) {
        while (true) {
            Scanner in = new Scanner(System.in);
            System.out.println("Enter the first number:");
            int a = in.nextInt();
            System.out.println("Enter the second number:");
            int b = in.nextInt();
            int sum = a + b;
            int product = a * b;
            System.out.println("The sum two number :" + sum);
            System.out.println("The sum two number :" + product);
            if (a > b) {
                System.out.println("The largest number is:" + a);
            } else
                System.out.println("The largest number is:" + b);}}}

 class A //parent class
{
    int x=9;
    public void m1()
    {
         System.out.println("java");
    }
    A(){}
}
  class B extends A // child class
{
    int x=8;
    public void m1 ()
    {
         System.out.println("hello");
    }
    public static void main (String [] args)
    {
        A b = new B ();
        System.out.println(b.x);}}
  class  s{}
class Vehicle extends Object {
    String type;
    public Vehicle(String type) {
        super();
        this.type = type;
        System.out.println("Vehicle type: " + type);
    }}
class Car extends Vehicle {
    String model;
    public Car(String type, String model) {
        super(type);
        this.model = model;
        System.out.println("Car model: " + model);
    }
     /*public Car(){
       // super();

     }*/
}

class ElectricCar extends Car {
    int batteryCapacity;
    public ElectricCar(String type, String model, int batteryCapacity) {
        super(type, model);
        this.batteryCapacity = batteryCapacity;
        System.out.println("Electric Car battery capacity: " + batteryCapacity + " kWh");    }}

class Main1 {
    public static void main(String[] args) {
        int x = 1;
        int y = 2;
        int z = x++;
        int a = --y;
        int b = z--;
        b += ++z;
        int answ = x>a?y>b?y:b:x>z?x:z;
        System.out.println(answ);
    }}


class organistation{
    int x =99;
    organistation(){
        mx();
    }
    void mx(){
        System.out.println(x);
    }
}
class employee extends  organistation{
    int x =9;
    void mx(){
        System.out.println(x);
    }
    employee(){

        mx();
    }

    public static void main(String[] args) {
        organistation bc=new employee();    }}




class Company {
    String name;
    Company() {
        name = "Unknown Company";
        displayName();    }


    void displayName() {
        System.out.println("Company Name: " + name);    }}
class Department extends Company {
    String name;
    Department() {
        name = "Human Resources";
        displayName();    }
    @Override
    void displayName() {
        System.out.println("Department Name: " + name);
    }
    public static void main(String[] args) {
        Company company = new Department();      }}


class bus{
    void m1()throws RuntimeException {}

}


