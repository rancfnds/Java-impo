Encapsulation is one of the fundamental principles of Object-Oriented Programming (OOP). It refers to the bundling of data (attributes) and methods (functions or procedures) that operate on the data into a single unit called a class. Encapsulation helps in hiding the internal state and implementation details of an object from the outside world, and only exposing the necessary parts for interaction.

### Key Concepts of Encapsulation

1. **Data Hiding**: The internal state (attributes) of an object is hidden from the outside world and can only be accessed through public methods (getters and setters), which are part of the class.

2. **Access Control**: Access modifiers (like private, protected, and public) are used to control the visibility of classes, methods, and data members.
   - **Private**: Accessible only within the same class.
   - **Protected**: Accessible within the same package and subclasses.
   - **Public**: Accessible from anywhere.

3. **Information Hiding**: Encapsulation protects the internal state of an object from modification by external code, ensuring that the object remains in a valid state.

### Benefits of Encapsulation

- **Modularity**: Encapsulation promotes modularity by dividing the program into smaller, manageable parts (classes) with well-defined interfaces.
  
- **Controlled Access**: By using access modifiers, encapsulation allows controlled access to data and methods, preventing unintended modification and ensuring data integrity.
  
- **Code Flexibility and Maintenance**: Encapsulation facilitates code maintenance and updates since changes made to the encapsulated class do not affect other parts of the program as long as the public interface remains unchanged.

### Example of Encapsulation in Java

Here’s a simple example in Java demonstrating encapsulation:

```java
// Class with encapsulation
class Employee {
    // Private data members
    private String name;
    private int age;
    private double salary;

    // Public getter and setter methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 18) {
            this.age = age;
        } else {
            System.out.println("Age must be greater than 18.");
        }
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating an object of the Employee class
        Employee emp = new Employee();

        // Setting values using setter methods
        emp.setName("John Doe");
        emp.setAge(30);
        emp.setSalary(50000.0);

        // Getting values using getter methods
        System.out.println("Employee Name: " + emp.getName());
        System.out.println("Employee Age: " + emp.getAge());
        System.out.println("Employee Salary: " + emp.getSalary());
    }
}
```

In this example:
- The `Employee` class encapsulates the attributes `name`, `age`, and `salary` with private access modifiers.
- Public getter (`getName()`, `getAge()`, `getSalary()`) and setter (`setName()`, `setAge()`, `setSalary()`) methods are used to access and modify the private data members.
- Encapsulation ensures that the internal state (attributes) of the `Employee` object is controlled and accessed through well-defined methods, maintaining data integrity and providing controlled access to data.