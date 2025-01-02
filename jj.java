import java.lang.reflect.Array;

public class jj {
}

class Cars {
    static String manufacturer;
    String model;
    double price;


       static {
           Cars c =new Cars();
          System.out.println(c.model);

        //manufacturer = "Generic Motors";
        System.out.println("Static block executed: Manufacturer set to " + manufacturer);
    }

    {
        manufacturer="kiki";
        System.out.println("Instance block executed: A new car is being created.");
    }
    public Cars() {
        this.model = "Unknown Model";
        this.price = 20000.0;
    }
        public Cars(String model, double price) {
        this.model = model;
        this.price = price;
    }
    public void displayCarInfo() {
        System.out.println("Car Model: " + model);
        System.out.println("Price: $" + price);
        System.out.println();
    }
    public static void main(String[] args) {
         Cars defaultCar = new Cars();
        defaultCar.displayCarInfo();
         Cars customCar = new Cars("Sedan", 25000.0);
        customCar.displayCarInfo();
    }
}


 