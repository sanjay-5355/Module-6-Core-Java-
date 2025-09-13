package java_lab;

class Car {
    String brand;
    String model;
    int year;
    double price;

    
    Car() {
        brand = "Unknown";
        model = "Unknown";
        year = 0;
        price = 0.0;
    }

    
    Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    
    Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    
    Car(String brand, String model, int year, double price) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    
    void displayCar() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Price: $" + price);
        System.out.println("--------------------------");
    }
}

public class L007_2ConstructorOverloading_parameter {

    public static void main(String[] args) {
        
        Car c1 = new Car();
        Car c2 = new Car("Toyota", "Corolla");
        Car c3 = new Car("Honda", "Civic", 2023);
        Car c4 = new Car("BMW", "X5", 2024, 75000);

        c1.displayCar();
        c2.displayCar();
        c3.displayCar();
        c4.displayCar();
    }
}
