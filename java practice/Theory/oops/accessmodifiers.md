Access modifiers in Java are keywords used to define the accessibility or visibility of classes, methods, and variables in Java programs. They control how classes, methods, and variables can be accessed from other classes or packages.

### Types of Access Modifiers:

Java provides four types of access modifiers:

1. **private**:
   - The `private` modifier limits the access to only within the same class.
   - Private methods and variables are not accessible from outside the class they are defined in.
   - Example:
     ```java
     class MyClass {
         private int num; // private variable

         private void display() { // private method
             System.out.println("Private method");
         }
     }
     ```

2. **default (package-private)**:
   - If no access modifier is specified, it is considered as default (package-private).
   - The default modifier allows access within the same package only.
   - Example:
     ```java
     class MyClass {
         int num; // default (package-private) variable

         void display() { // default (package-private) method
             System.out.println("Default (package-private) method");
         }
     }
     ```

3. **protected**:
   - The `protected` modifier allows access within the same package and by subclasses (inheritance).
   - Example:
     ```java
     class Parent {
         protected int num; // protected variable
         
         protected void display() { // protected method
             System.out.println("Protected method");
         }
     }

     class Child extends Parent {
         void accessParent() {
             num = 10; // Accessing protected variable from subclass
             display(); // Accessing protected method from subclass
         }
     }
     ```

4. **public**:
   - The `public` modifier allows access from any other class or package.
   - Public methods and variables can be accessed by any other class.
   - Example:
     ```java
     public class MyClass {
         public int num; // public variable

         public void display() { // public method
             System.out.println("Public method");
         }
     }
     ```

### Access Modifiers Summary:

- **private**: Accessible only within the same class.
- **default (package-private)**: Accessible within the same package.
- **protected**: Accessible within the same package and by subclasses (even if they are in different packages).
- **public**: Accessible from any other class.

### Choosing the Right Access Modifier:

- Use `private` for members that should not be accessible outside the class.
- Use default (package-private) for members that are only accessed within the same package.
- Use `protected` for members that should be accessible to subclasses and within the same package.
- Use `public` for members that need to be accessible from any other class or package.

Access modifiers help enforce encapsulation, improve code readability, and manage class dependencies effectively in Java programs.