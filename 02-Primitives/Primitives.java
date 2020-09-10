/********************************       PRIMITIVES  notes       *********************************
 *
 * Primitive types are the most basic data types available within the Java language.
 *
 * There are 8: boolean , byte , char , short , int , long , float and double.
 *
 * These types serve as the building blocks of data manipulation in Java.
 * Such types serve only one purpose — containing pure, simple values of a kind.
 */


/**************************         JAVA PACKAGES        ********************************************
 *
 * A package is a way to organize your Java projects.
 *
 * Think of them like folders/directories with subfolders inside.
 *
 * Companies use their domain names reversed as Java Packages.
 * For example:
 * companyName.subfolder would be 'subfolder.companyName' as a Java Package
  */

public class Primitives {

    public static void main(String[] args) {
        int x = 5; // Declaration statement - to define variable by indicating data type and name.

        int y = (2 + 4) * (22 - 7);
        int total = x + y;

        System.out.println(total);
    }
}
