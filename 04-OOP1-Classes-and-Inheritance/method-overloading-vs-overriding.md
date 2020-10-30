# Method Overloading vs Method Overriding

## Method Overloading
Method **overloading** is providing two or more separate methods in a class with the **same name** but **different parameters**.

Method return type may or may not be different, and that allows us to **reuse** the same method name.

**Overloading** is very handy, since it reduces duplicated code and we don't have to remember multiple method names.

**Overloading** does not have anything to do with **polymorphism**, but Java developers often
refer to overloading as "Compile Time Polymorphism".
In other words, the compiler decided with method is going to be called based on the method name, return type, and argument list.

We **can overload static** and **instance** methods.

Usually, **overloading** happens inside a single class,
but a method can also be treated as **overloaded** in the subclass of that class.

That is because a **subclass inherits** one version of the method from the parent class,
and then the subclass can have another overloaded version of the method.

### Rules for Method Overloading
Methods will be considered overloaded if both obey the following rules:
- Methods must have same method name.
- Methods must have different parameters.

If methods follow above rules, then they may or may not:
- Have different return types.
- Have different access modifiers.
- Throw different checked or unchecked exceptions.


## Method Overriding

Method **overriding**
: means defining a method in a child class that already exists in the parent class with the same signature.
Same signature, meaning it has the same name, same arguments.

By extending the parent class, the child class gets all the methods defined in the parent class.
These methods are also known as **derived methods**.

Method **overriding** is also known as **Runtime Polymorphism** and **Dynamic Method Dispatch**,
because the method that is going to be called is decided at runtime by the JVM.

When we **override** a method, it's recommended to put **@Override** immediately above the method definition.
This is an annotation that the compiler reads and will then show us an error if we don't follow overriding rules correctly.

We **CAN NOT override static methods**.  **Only instance methods can be overridden**

### Rules for Method Overriding
A method will be considered overridden if it follows these rules:
- It must have the same name and same arguments (aka same signature).
- Return type can be a subclass of the return type in the parent class.
- It can not have a lower access modifier.
- For example, if the parent method is protected, then using *private* in the child is not allowed, but using *public* in the child would be allowed.


There are some **important points** about method overriding to keep in mind.
- **Only inherited methods can be overridden**, in other words methods can be overridden only in child classes.
- **Constructors and private methods CAN NOT be overridden**.
- Methods that are final cannot be overridden. (see notes on final methods below list).
- A subclass can use **super.methodName()** to call the super class version of an overridden method.

The **final** modifier for finalizing the implementations of classes, methods, and variables.

We can declare a method as final, once you declare a method final it cannot be overridden.
So, you cannot modify a final method from a sub class.

The main intention of making a method final would be that the content of the method should not be changed by any outsider.

**Example**
```
public class FinalMethodExample {
   public final void display(){
      System.out.println("Hello");
   }
   public static void main(String args[]){
      new FinalMethodExample().display();
   }
   class Sample extends FinalMethodExample{
      public void display(){
         System.out.println("hi");
      }
   }
}
```

## Method Overriding vs Overloading
### Simple Example of Method Overriding
```
class Dog {
  public void bark() {
    System.out.println("woof");
  }
}

class GermanShepherd extends Dog {

  @Override
  public void bark() {  // same name and same parameters as super class's bark method.
    System.out.println("woof woof woof");
  }
}
```

### Simple Example of Method Overloading
```
class Dog {
  public void bark() {
    System.out.println("woof");
  }

  public void bark(int number) {  // same name but different parameters.
    for (int i = 0; i < number; i++) {
      System.out.println("woof");
    }
  }
}
```

### RECAP
| **Method Overloading**             |  **Method Overriding**                   |
| ---------------------------------- | ---------------------------------------- |
| Provides functionality to reuse a method name with different parameters | Used to override a behavior which the class has inherited from the parent class. |
| Usually in a single class, but may also be used in a child class. | **Always in two classes** that have a child-parent or *IS-A* relationship. |
| **Must have** different parameters. | **Must have** the same parameters and same name. |
| May have different return types. | Must have the same return type or covariant return type (child class). |
| May have different access modifiers (private, protected, public). | **Must NOT** have a lower modifier, but may have a higher modifier. |
| May throw different exceptions. | **Must NOT** throw a new or broader checked exception. |
