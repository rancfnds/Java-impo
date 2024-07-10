
### Method Overloading

Method overloading in Java allows a class to have more than one method having the same name, if their parameter lists are different (either in terms of number of parameters or type of parameters). Method overloading is resolved during compile-time.

#### Key Points of Method Overloading:

1. **Parameter Lists**: Methods must have different parameter lists (number or type of parameters).
2. **Return Type**: Method overloading can have the same or different return types.
3. **Access Modifiers**: Method overloading can have the same or different access modifiers.
4. **Exceptions**: Method overloading can declare the same or different checked or unchecked exceptions.
5. **Static Methods**: Overloaded methods can be static methods.

#### Example of Method Overloading:

```java
class Calculator {
    // Method with two integer parameters
    int add(int a, int b) {
        return a + b;
    }

    // Method with two double parameters
    double add(double a, double b) {
        return a + b;
    }

    // Method with three integer parameters
    int add(int a, int b, int c) {
        return a + b + c;
    }
}
```

In this example:
- The `Calculator` class has multiple `add` methods with the same name but different parameter lists.
- The compiler determines which method to call based on the number and types of arguments passed at compile-time.

### Method Overriding

Method overriding occurs when a subclass provides a specific implementation of a method that is already provided by its superclass. It allows a subclass to provide a specialized implementation of a method that is already provided by its superclass. Method overriding is resolved during runtime (dynamic polymorphism).

#### Key Points of Method Overriding:

1. **Method Signature**: The method in the subclass must have the same  name, parameters, and return type as the method in the superclass.
2. **Inheritance**: Method overriding requires inheritance, where the subclass extends the superclass.
3. **@Override Annotation**: It is optional but recommended to use `@Override` annotation to indicate that the method is intended to override a method in the superclass.

#### Example of Method Overriding:

```java
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}
```

In this example:
- The `Animal` class has a method `sound()`.
- The `Dog` class extends `Animal` and overrides the `sound()` method with its specific implementation.
- When an object of `Dog` class is instantiated and `sound()` method is called, it executes the overridden method in `Dog`, demonstrating dynamic polymorphism.

### Key Differences Between Method Overloading and Method Overriding

- **Definition**: Method overloading occurs within the same class with different method signatures, while method overriding occurs in different classes with the same method signature.
- **Resolution**: Method overloading is resolved during compile-time (static polymorphism), while method overriding is resolved during runtime (dynamic polymorphism).
- **Inheritance**: Method overriding requires inheritance, while method overloading does not necessarily require inheritance.

Understanding method overloading and method overriding is crucial for leveraging polymorphism effectively in Java, allowing for more flexible and reusable code structures.