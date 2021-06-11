package oop.encapsulation;

/** NOTES **

 Encapsulation is shown in the "EnhancedPlayer" class file.  This main file shows what NOT to do (and the code is commented out)

 In the case of this "game" example, using the player class - we might want to have some validation.
 So, for example, we might want to go through a method to add health, to make sure they select an appropriate value.

 By allowing access at this level for people to actually just type in directly, we can't call this validation.
 This is why we don't want to code like this - without validation

 So, this is what encapsulation actually does for us.
 We want the ability to override certain things so that we can make sure the class we are using for access checks something is valid.


 ** DEFINITION **

 * Encapsulation in Java is a mechanism of wrapping the data (variables)
 and code acting on the data (methods) together as a single unit.
 In encapsulation, the variables of a class will be hidden from other classes,
 and can be accessed only through the methods of their current class.
 Therefore, it is also known as data hiding.

 * To achieve encapsulation in Java −

 * Declare the variables of a class as private.

 * Provide public setter and getter methods to modify and view the variables values.

 */
public class Main {

    public static void main(String[] args) {
//        // COMMENTED OUT CODE IS TO SHOW THE WRONG WAY OF CODING THIS.
//        Player player = new Player();
//        // need to manually set or initialize fields, since there is no default constructor for Player class.
//        player.fullName = "Gary";
//        player.health = 20;
//        player.weapon = "Sword";
//        // NOTE: We can access these fields in class bc of public scope
//
//        int damage = 10;
//        player.loseHealth(damage);
//        System.out.println("Remaining health = " + player.healthRemaining());
//
//        damage = 11;
//        player.loseHealth(damage);
//        System.out.println("Remaining health = " + player.healthRemaining());


        // Start of the proper ENCAPSULATION code, using the EnhancedPlayer class
        EnhancedPlayer player = new EnhancedPlayer("Gary", 50, "Sword");
        System.out.println("Initial health is " + player.getHealth());
    }
}

/**
 * The reason why we want to go about this code by using encapsulation is because it allows us to keep things confined
 * and protect certain variables by hiding the data from the user.
 *
 * We protect the members of the class (and some methods) from external access or unauthorized access.
 */