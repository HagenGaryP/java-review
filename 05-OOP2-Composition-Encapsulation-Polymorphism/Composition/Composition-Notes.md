# COMPOSITION vs INHERITANCE

#### The "is-a" and "has-a" relationship terms
**Is-A**
: A phrase to say that something inherits from another, as in a "salmon" **is-a** "fish."

**Has-A**
: A phrase to say that something is composed of other things, or has a trait. As in, "a salmon **has-a** mouth."

Now that we learned how to leverage **inheritance** for code reuse, by establishing is-a relationships between classes.

**Composition** is a closely related programming technique that is used to establish has-a relationships instead.

Whereas inheritance extends the features of one class to another, **composition allows us to compose one class from another class**.
The distinction is subtle at first, but it will make more sense once you see it in code.

**Composition**
: The concept that a class can be composed of other classes as parts, much like a car has wheels.

Java **composition** is achieved by using **instance variables that refers to other objects**.

Composition deals with a "Has-A" relationship - which is essentially the class object's parts.

#### Java Composition Benefits.

- If you are looking for code reuse and the relationship between two classes is **has-a** then you should **use composition rather than inheritance**.

- Benefit of using composition in java is that we can control the visibility of other object to client classes and reuse only what we need.


In composition, a class has a field whose type is that of another class.

For example, **Vehicle** has a **String** field named **make**.
It could also have an **Engine** field named **engine** and a **Transmission** field named **transmission:**
```
class Vehicle {
   private String make;
   private Engine engine;
   private Transmission transmission;
   // ...
}

class Transmission{
   // ...
}

class Engine{
   // ...
}
```
In this example, we would say that a vehicle is composed of a make, an engine, and a transmission because it has a make field, an engine field, and a transmission field.


- In addition to composing classes from other classes, you can use this technique to **compose objects from other objects**,
**by storing object references in another object's fields.**

### Inheritance breaks encapsulation
Inheritance is problematic because it breaks encapsulation.
Recall that **encapsulation** refers to combining constructors, fields, and methods into a class's body.
In inheritance, a subclass relies on implementation details in its superclass.
If the superclass's implementation details change, the subclass might break.
This problem is especially serious when a developer doesn't have complete control over the superclass, or when the superclass hasn't been designed and documented with extension in mind.


### How to break a subclass: An example
To understand this problem, suppose you've purchased a library of Java classes that implement a contact manager.
Although you don't have access to their source code, assume that Listing 1 (below) describes the main **CM** class.

**Listing 1.** Implementing part of a contact manager
```
public class CM {
   private final static int MAX_CONTACTS = 1000;
   private Contact[] contacts;
   private int size;

   public CM() {
      contacts = new Contact[MAX_CONTACTS];
      size = 0; // redundant because size is automatically initialized to 0
                // adds clarity, however
   }

   public void addContact(Contact contact) {
      if (size == contacts.length)
         return; // array is full
      contacts[size++] = contact;
   }

   public void addContacts(Contact[] contacts) {
      for (int i = 0; i < contacts.length; i++)
      addContact(contacts[i]);
   }
}
```
The CM class stores an array of contacts, with each contact described by a Contact instance.
For this discussion, the details of Contact aren't important; it could be as trivial as public class Contact {}.


Now suppose you wanted to log each contact in a file.
Because a logging capability isn't provided, you extend **CM** with (the code below) Listing 2's **LoggingCM** class,
which adds logging behavior in overriding **addContact()** and **addContacts()** methods.

**Listing 2.** Extending the contact manager with support for logging
```
public class LoggingCM extends CM {
   // A constructor is not necessary because the Java compiler will add a
   // no-argument constructor that calls the superclass's no-argument
   // constructor by default.

   @Override
   public void addContact(Contact contact) {
      Logger.log(contact.toString());
      super.addContact(contact);
   }

   @Override
   public void addContacts(Contact[] contacts) {
      for (int i = 0; i < contacts.length; i++)
         Logger.log(contacts[i].toString());
      super.addContacts(contacts);
   }
}
```
The **LoggingCM** class relies on a **Logger** class (see Listing 3) whose **void log(String msg)** class method logs a string to a file.
A **Contact** object is converted to a string via **toString()**, which is passed to **log()**.


**Listing 3.** log() outputs its argument to the standard output stream
```
class Logger {
   static void log(String msg) {
      System.out.println(msg);
   }
}
```
Although **LoggingCM** looks okay, it doesn't work as you might expect.
Suppose you instantiated this class and added a few **Contact** objects to the object via **addContacts()**:

**Listing 4. The problem with inheritance**
```
class CMDemo {

   public static void main(String[] args) {
      Contact[] contacts = { new Contact(), new Contact(), new Contact() };
      LoggingCM lcm = new LoggingCM();
      lcm.addContacts(contacts);
   }
}
```
If you run this code, you will discover that **log()** outputs a total of six messages.
The problem is that each of the expected three messages (one per **Contact** object) is duplicated.

#### What happened?
When **LoggingCM**'s **addContacts()** method is called, it first calls **Logger.log()** for each **Contact** instance in the **contacts** array that is passed to **addContacts()**.
This method then calls **CM**'s **addContacts()** method via **super.addContacts(contacts);**.

CM's addContacts() method calls LoggingCM's overriding addContact() method,
one for each Contact instance in its contacts array argument.

The addContact() method then executes Logger.log(contact.toString());, to log its contact argument's string representation,
and you end up with three additional logged messages.


### Method overriding and the fragile base class problem
If you didn't override the addContacts() method, this problem would go away.
But in that case the subclass would still be tied to an implementation detail: CM's addContacts() method calls addContact().

It isn't a good idea to rely on an implementation detail when that detail isn't documented.
(Recall that you don't have access to CM's source code.)

When a detail isn't documented, it can change in a new version of the class.

Because a base class change can break a subclass, this problem is known as the fragile base class problem.

A related cause of fragility (which also has to do with overriding methods) occurs when new methods are added to a superclass in a subsequent release.

For example, suppose a new version of the library introduces a public void addContact(Contact contact, boolean unique) method into the CM class.
This method adds the contact instance to the contact manager when unique is false.
When unique is true, it adds the contact instance only if it wasn't previously added.

Because this method was added after the LoggingCM class was created, LoggingCM doesn't override the new addContact() method with a call to Logger.log().
As a result, Contact instances passed to the new addContact() method are not logged.


Here's another problem: you introduce a method into the subclass that is not also in the superclass.
A new version of the superclass presents a new method that matches the subclass method signature and return type.
Your subclass method now overrides the superclass method and probably doesn't fulfill the superclass method's contract.



### Composition (and forwarding) to the rescue

Fortunately, you can make all of these problems disappear.
Instead of extending the superclass, create a **private** field in a new class, and have this field reference an instance of the superclass.

**This workaround entails forming a has-a relationship between the new class and the superclass, so the technique you are using is composition.**


Additionally, **you can make each of the new class's instance methods call the corresponding superclass method and return the called method's return value.**
You do this via the superclass instance that was saved in the **private** field.
This task is known as **"forwarding"**, and the new methods are known as **forwarding methods**.


Listing 5 presents an improved LoggingCM class that **uses composition and forwarding** to forever eliminate the fragile base class problem,
and the additional problem of unanticipated method overriding.

**Listing 5.** Composition and method forwarding demo
```
public class LoggingCM {
   private CM cm;

   public LoggingCM(CM cm) {
      this.cm = cm;
   }

   public void addContact(Contact contact) {
      Logger.log(contact.toString());
      cm.addContact(contact);
   }

   public void addContacts(Contact[] contacts) {
      for (int i = 0; i < contacts.length; i++) {
         Logger.log(contacts[i].toString());
      }
      cm.addContacts(contacts);
   }
}
```
Note that in this example the LoggingCM class doesn't depend upon implementation details of the CM class.
You can add new methods to CM without breaking LoggingCM.


#### Wrapper classes and the Decorator design pattern

Listing 5's LoggingCM class is an example of a **wrapper class, which is a class whose instances wrap other instances**.

Each LoggingCM object wraps a CM object. LoggingCM is also an example of the Decorator design pattern.

To use the new LoggingCM class, you must first instantiate CM and pass the resulting object as an argument to LoggingCM's constructor.
The LoggingCM object wraps the CM object, as follows:
```
LoggingCM lcm = new LoggingCM(new CM());
```



### Inheritance vs Composition - example

Most uses of inheritance can be simplified or replaced with composition.

**Consider the following code. Is this a good example of inheritance?**
```
import java.util.HashSet;

public class CharacterBadExampleInheritance extends HashSet<Object> {

  public static void main(String... badExampleOfInheritance) {
    BadExampleInheritance badExampleInheritance = new BadExampleInheritance();
    badExampleInheritance.add("Homer");
    badExampleInheritance.forEach(System.out::println);
  }
}
```
In this case, the answer is **no, this is not a good example of Inheritance**.
The child class inherits many methods that it will never use, resulting in tightly coupled code that is both confusing and difficult to maintain.
If you look closely, it is also clear that this code does not pass the "is a" test.
Which is when the subclass *is a* specialized version of the superclass (*parent class*)


#### Side notes on Multiple Inheritance (not supported in Java)

In OOP **multiple inheritance should be avoided at all costs.**
Multiple Inheritance is a feature of object oriented concept, where a class can inherit properties of more than one parent class.
The problem occurs when there exist methods with same signature in both the super classes and subclass.
On calling the method, the compiler cannot determine which class method to be called and even on calling which class method gets the priority.
- Java does not support Multiple Inheritance - throwing compiler errors when ran.
It causes "the diamond problem" when allowed in other languages like C++.
This is when there is a GrandParent class that has two child classes, and those two classes then both become the parents of another subclass.
For example:
```
// A Grand parent class in diamond
class GrandParent {
    void fun() {
        System.out.println("Grandparent");
    }
}

// First Parent class
class Parent1 extends GrandParent {
    void fun() {
        System.out.println("Parent1");
    }
}

// Second Parent Class
class Parent2 extends GrandParent {
    void fun() {
        System.out.println("Parent2");
    }
}

// Error : Test is inheriting from multiple classes
class Test extends Parent1, Parent2 {
   public static void main(String args[]) {
       Test t = new Test();
       t.fun();
   }
}
```
Output:
```
Error :
prog.java:31: error: '{' expected
class Test extends Parent1, Parent2
                          ^
1 error
```
From the code, we see that: On calling the method fun() using Test object will cause complications such as whether to call Parent1’s fun() or Child’s fun() method.

Therefore, in order to avoid such complications Java does not support multiple inheritance of classes.



## SUMMARY

- Inheritance involves an "is-a" relationship.

- we can use composition in cases where one object "has" (or is part of) another object.
Some examples would be:

<t>A car has a battery (a battery is part of a car).
<t>A person has a heart  (a heart is part of a person).
<t>A house has a living room (a living room is part of a house).

- composition resolves one of the main programming challenges associated with inheritance, which is that it breaks encapsulation.

- Composition is an important programming technique for situations where future developers are unlikely to have access to or control over the superclass.

- It's an especially critical technique for cases where a class package or library has not been designed and documented with extension in mind.

#### What does it mean to design and document for class extension?

*Design* means to provide **protected** methods that hook into the class's inner workings (to support writing efficient subclasses)
and ensure that constructors and the **clone()** method never call overridable methods.

*Document* means to clearly describe the impact of overriding methods.


#### When you should extend a class or use a wrapper

Extend a class when there is an is-a relationship between the superclass and the subclass,
and either you have control over the superclass or the superclass has been designed and documented for class extension.
Otherwise, use a wrapper class.


Finally, you might have heard that you shouldn't use wrapper classes in a *callback framework*.
A *callback framework* is an object framework where an object passes its own reference to another object (via **this**),
so that the latter object can call the former's methods at a later time -- a *callback*.

**You shouldn't use wrapper classes in the aforementioned context**,
because the wrapped object doesn't know of its wrapper class (it passes only its reference via this)
and **resulting callbacks don't invoke the wrapper class's methods.**
