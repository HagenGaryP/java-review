package oop.Polymorphism;

/**
 * POLYMORPHISM is essentially the method or mechanism in object-oriented programming that allows actions to act differently
 * based on the actual object that the action is being performed on.


 To demonstrate polymorphism, you need to crate a number of classes, all within this main public class file,
 which is another way of creating classes that aren't going to be reused.
 It's really only useful to create classes in the same Java source file if they are small and compact.

 In this example - We're going to create a basic class called "Movie" and then we will create a number of classes that relate
 to a specific movie that already exists.  So, we will just inherit from that to see how polymorphism works.

 */

// BASE CLASS - "Movie"
class Movie {
    private String name;

    public Movie(String name) {
        this.name = name;
    }

    public String plot() {
        return "No plot here";
    }

    public String getName() {
        return name;
    }
}

// Creating 5 additional classes that will each inherit from the base Movie class.

class Jaws extends Movie {
    // constructor for subclass
    public Jaws() {
        super("Jaws");
    }

    // plot method - specific for this class (the movie "Jaws")
    public String plot() {
        return "A shark eats people...";
    }
}

class IndependenceDay extends Movie {

    public IndependenceDay() {
        super("Independence Day");
    }

    // override method - same as doing it manually
    @Override
    public String plot() {
        return "Aliens attempt to take over Earth.";
    }
}

class MazeRunner extends Movie {

    public MazeRunner() {
        super("Maze Runner");
    }

    @Override
    public String plot() {
        return "Kids try to escape a maze.";
    }
}

class StarWars extends Movie {
    public StarWars() {
        super("Star Wars");
    }

    @Override
    public String plot() {
        return "Imperial Forces try to take over the universe";
    }
}

// some class that represents a movie we don't know or have forgotten.
class Forgettable extends Movie {
    public Forgettable() {
        super("Forgettable");
    }

    // NO PLOT METHOD
}

// MAIN METHOD
public class Main {

    public static void main(String[] args) {
        // for loop to retrieve a random movie on each iteration
        for (int i = 1; i < 11; i++) {
            Movie movie = randomMovie();
            System.out.println("Movie #" + i +
                        " : " + movie.getName() + "\n" +
                        "Plot: " + movie.plot() +"\n");  // this is where the polymorphism takes place, with movie.plot()
        }
    }

    // method to return a random movie
    public static Movie randomMovie() {
        // getting a random number, casting the double to an int.
        int randomNumber = (int) (Math.random() * 5 ) + 1;
        System.out.println("Random number = " + randomNumber);

        switch (randomNumber) {
            case 1:
                return new Jaws(); // dont need to break bc we're returning.  Can do it, but it's redundant.

            case 2:
                return new IndependenceDay();

            case 3:
                return new MazeRunner();

            case 4:
                return new StarWars();

            case 5:
                return new Forgettable();

//            default:
//                return null;
        }

        return null; // if we leave out the default return statement for the switch, we will need to return null if no case matches.
    }
}
