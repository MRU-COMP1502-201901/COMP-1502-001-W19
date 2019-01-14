


// Object Oriented Programming

// Combine code with our data
// each action on an object changes or reveils the data in some way

// Each class describes how to build an object
// each class provides a type

// rule in java: every Class *must* be in a file with the same name
public class Dog {

    // with no constructor defined a default empty constructor will
    // try to setup all instance variables with their default values


    // instance variables - unique for each *instance* of the class
    String name;
    String breed;
    boolean hypoallergenic;
    double weight;
    int age;
    char sex;

    // constructors have not return type because they are returning
    // the object to *new*
    public Dog(String name, // arguments 
	       String breed,
	       boolean hypo,
	       double weight,
	       int age,
	       char sex) {

	name = name;

    }

    public static void main(String[] args) {

	// default constructor isn't generated after a constructor is defined
	Dog d = new Dog();

	// whenever we say new, we're telling Java to create a reference to
	// a new Object, a new instance
	String s1 = new String("");
	String s2 = new String("COMP 1502");
	String s3 = "I'm weird!";
	s3 = "Weird's gone now";


	int x = 17;
	int y = 12;
    }

}