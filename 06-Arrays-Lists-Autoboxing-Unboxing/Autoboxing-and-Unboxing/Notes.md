# Autoboxing and Unboxing in Java

[View Oracle Documentation on Autoboxing and Unboxing](https://docs.oracle.com/javase/tutorial/java/data/autoboxing.html)

**Autoboxing: Converting a primitive value into an object of the corresponding wrapper class is called autoboxing.**
For example, converting int to Integer class. The Java compiler applies autoboxing when a primitive value is:
- Passed as a parameter to a method that expects an object of the corresponding wrapper class.
- Assigned to a variable of the corresponding wrapper class.

**Unboxing: Converting an object of a wrapper type to its corresponding primitive value is called unboxing.**
For example conversion of Integer to int. The Java compiler applies unboxing when an object of a wrapper class is:
- Passed as a parameter to a method that expects a value of the corresponding primitive type.
- Assigned to a variable of the corresponding primitive type.


<br>

Autoboxing and unboxing lets developers write cleaner code, making it easier to read. The following table lists the primitive types and their corresponding wrapper classes, which are used by the Java compiler for autoboxing and unboxing:

| Primitive type | Wrapper class |
|:--------------:|:-------------:|
| boolean |	Boolean |
| byte | Byte |
| char | Character |
| float | Float |
| int | Integer |
| long | Long |
| short | Short |
| double | Double |

<br>


## When and how to utilize Autoboxing and Unboxing

[view examples on geeksforgeeks.org](https://www.geeksforgeeks.org/autoboxing-unboxing-java/)
