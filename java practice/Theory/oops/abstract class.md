An abstract class in Java is a class that cannot be instantiated on its own and is meant to be subclassed by other classes. It serves as a blueprint for other classes and may contain abstract methods, concrete methods, or both.

### Key Characteristics of Abstract Classes:

1. **Abstract Methods**: An abstract class can have abstract methods, which are declared but not implemented (no method body). Subclasses must provide implementations for these abstract methods.

2. **Concrete Methods**: An abstract class can also have concrete methods (methods with a body) that are inherited by its subclasses. These methods can be used as-is or overridden in the subclasses.

3. **Cannot be Instantiated**: You cannot create objects of an abstract class directly using the `new` keyword. It can only be used as a superclass for other classes.

4. **Purpose**: Abstract classes are used to define common behavior for subclasses. They provide a way to define methods that must be implemented by subclasses, while also providing a default implementation for other methods.

### Syntax and Example of Abstract Class:

```java
// Abstract class
abstract class Animal {
    // Abstract method (no implementation)
    abstract void makeSound();

    // Concrete method (with implementation)
    void sleep() {
        System.out.println("Animal is sleeping");
    }
}

// Concrete subclass
class Dog extends Animal {
    // Implementation of the abstract method
    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }
}

public class Main {
    public static void main(String[] args) {
        // Animal animal = new Animal(); // Cannot instantiate an abstract class

        // Create an object of the subclass (Dog)
        Dog dog = new Dog();
        dog.makeSound(); // Output: Dog barks
        dog.sleep();     // Output: Animal is sleeping
    }
}
```

### Explanation:

- `Animal` is an abstract class that defines an abstract method `makeSound()` (no implementation) and a concrete method `sleep()` (with implementation).
- `Dog` extends `Animal` and provides an implementation for the `makeSound()` method. It also inherits the `sleep()` method from `Animal`.
- You cannot instantiate an `Animal` object directly (`Animal animal = new Animal();` is not allowed), but you can create objects of concrete subclasses like `Dog`.
- Abstract classes are used when you want to define a template for other classes to follow, ensuring that certain methods are implemented while providing default behavior for others.

### When to Use Abstract Classes:

- Use abstract classes when you want to define common methods that subclasses must implement.
- Use abstract classes when you want to provide a default implementation that subclasses can override if needed.
- Use abstract classes to establish a hierarchy of related classes where some methods are common across all subclasses, but specifics may vary.

Abstract classes play a crucial role in Java programming, especially when designing frameworks or APIs where certain methods need to be implemented by users of the framework while others provide common functionality.