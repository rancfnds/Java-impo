     a constructor is a special type of method that is automatically called when an object of a class is instantiated (created) using the `new` keyword. It initializes the newly created object. Constructors have the same name as the class and do not have a return type, not even `void`.

### Key Characteristics of Constructors:

1. **Name**: Constructors have the same name as the class they belong to.
   
2. **No Return Type**: Constructors do not have a return type, not even `void`.

3. **Initialization**: They are used to initialize objects, setting initial values for object attributes.

4. **Automatic Invocation**: Constructors are automatically called when an object of the class is created using the `new` keyword.

5. **Overloading**: Like methods, constructors can be overloaded, allowing a class to have multiple constructors with different parameter lists.

6. **Default Constructor**: If no explicit constructors are defined in a class, Java provides a default constructor (no-argument constructor) automatically.

### Types of Constructors:

1. **No-argument Constructor**: A constructor with no parameters. If no constructor is explicitly defined in a class, Java provides a default no-argument constructor.

   ```java
   class MyClass {
       // No-argument constructor
       MyClass() {
           // Constructor body
       }
   }
   ```

2. **Parameterized Constructor**: A constructor with parameters, used to initialize an object with specific values during instantiation.

   ```java
   class Employee {
       String name;
       int age;

       // Parameterized constructor
       Employee(String n, int a) {
           name = n;
           age = a;
       }
   }
   ```

3. **Constructor Overloading**: Having multiple constructors in a class with different parameter lists. Java determines which constructor to call based on the arguments provided during object creation.

   ```java
   class Student {
       String name;
       int age;

       // Constructor with one parameter
       Student(String n) {
           name = n;
       }

       // Constructor with two parameters
       Student(String n, int a) {
           name = n;
           age = a;
       }
   }
   ```

### Example of Using Constructors:

```java
class Car {
    String brand;
    String model;
    int year;

    // Parameterized constructor
    Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    // Method to display car details
    void displayDetails() {
        System.out.println("Car: " + brand + " " + model + " (" + year + ")");
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating objects using the parameterized constructor
        Car car1 = new Car("Toyota", "Camry", 2022);
        Car car2 = new Car("Honda", "Accord", 2021);

        // Calling a method to display details of the cars
        car1.displayDetails(); // Output: Car: Toyota Camry (2022)
        car2.displayDetails(); // Output: Car: Honda Accord (2021)
    }
}
```

### Explanation:

- In the `Car` class, a parameterized constructor `Car(String brand, String model, int year)` initializes the object with values for `brand`, `model`, and `year`.
- Two objects (`car1` and `car2`) are created using the constructor, each with different values passed as arguments.
- The `displayDetails()` method prints out the details of each car using the values initialized by the constructor.

Constructors are essential in Java for initializing objects with specific initial states and are invoked automatically when an object is created, ensuring that the object is properly initialized before use.