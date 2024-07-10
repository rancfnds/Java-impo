### Inheritance

Inheritance is a fundamental concept in Object-Oriented Programming (OOP) that allows a class to inherit properties and behaviors (methods) from another class. The class that inherits is called the **subclass** or **derived class**, and the class from which it inherits is called the **superclass** or **base class**.

### Key Points of Inheritance

1. **Reusability**: Inheritance promotes reusability of code. By inheriting from an existing class, the subclass can reuse the methods and fields of the superclass without rewriting them.

2. **Method Overriding**: The subclass can provide a specific implementation of a method that is already defined in its superclass. This is called method overriding and it allows for dynamic polymorphism.

3. **Extensibility**: Inheritance allows the extension of existing code without modifying it. New features can be added to a subclass without altering the existing code in the superclass.

4. **Hierarchical Relationships**: Inheritance establishes a natural hierarchical relationship between classes. This can be visualized as a tree structure where a base class branches out into multiple derived classes.

### Types of Inheritance

1. **Single Inheritance**: A subclass inherits from one superclass.
    ```java
    class Animal {
        void eat() {
            System.out.println("This animal eats food.");
        }
    }

    class Dog extends Animal {
        void bark() {
            System.out.println("The dog barks.");
        }
    }
    ```

2. **Multilevel Inheritance**: A class is derived from another derived class.
    ```java
    class Animal {
        void eat() {
            System.out.println("This animal eats food.");
        }
    }

    class Dog extends Animal {
        void bark() {
            System.out.println("The dog barks.");
        }
    }

    class Puppy extends Dog {
        void weep() {
            System.out.println("The puppy weeps.");
        }
    }
    ```

3. **Hierarchical Inheritance**: Multiple classes inherit from a single superclass.
    ```java
    class Animal {
        void eat() {
            System.out.println("This animal eats food.");
        }
    }

    class Dog extends Animal {
        void bark() {
            System.out.println("The dog barks.");
        }
    }

    class Cat extends Animal {
        void meow() {
            System.out.println("The cat meows.");
        }
    }
    ```

4. **Multiple Inheritance**: A class can inherit from more than one class. (Note: Java does not support multiple inheritance with classes to avoid complexity and ambiguity, but it can be achieved using interfaces).
    ```java
    interface Animal {
        void eat();
    }

    interface Pet {
        void play();
    }

    class Dog implements Animal, Pet {
        public void eat() {
            System.out.println("This dog eats food.");
        }

        public void play() {
            System.out.println("The dog plays.");
        }
    }
    ```

### Example of Inheritance in Java

Here’s a practical example demonstrating inheritance:

```java
// Superclass
class Animal {
    // Method in the superclass
    void eat() {
        System.out.println("This animal eats food.");
    }
}

// Subclass
class Dog extends Animal {
    // Method in the subclass
    void bark() {
        System.out.println("The dog barks.");
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating an object of the subclass
        Dog dog = new Dog();
        
        // Calling methods from both the subclass and superclass
        dog.eat();  // Output: This animal eats food.
        dog.bark(); // Output: The dog barks.
    }
}
```

In this example:
- The `Animal` class is the superclass with a method `eat()`.
- The `Dog` class is the subclass that inherits from `Animal` and adds a new method `bark()`.
- When an object of the `Dog` class is created, it can access methods of both the `Dog` and `Animal` classes.