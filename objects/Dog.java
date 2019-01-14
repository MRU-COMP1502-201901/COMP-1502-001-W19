


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
    private String name = "Fluffy";
    private String breed;
    private boolean hypoallergenic;
    private double weight;
    private int age;
    private char sex;



    // accessor method
    public String getName() {
	return this.name;
    }

    // mutator method
    public void setName(String name) {
	this.name = name;
    }

    public Dog() {
	

    }

    public Dog(String name) {
	this.name = name;
    }

    // cant do this because method overloading only looks at arg type
    //    public Dog(String breed) {
    //	this.breed = breed;
    //}

    // constructors have not return type because they are returning
    // the object to *new*
    public Dog(String name, // arguments 
	       String breed,
	       boolean hypo,
	       double weight,
	       int age,
	       char sex) {

	// always refer to an instance variable with 
	// this.
	// its a reference to the instance
	this.name = name;
	this.breed = breed;
	this.hypoallergenic = hypo;
	this.weight = weight;
	this.age = age;
	this.sex = sex;


    }

    @Override
    public String toString() {
	return name + " " + breed + " " + hypoallergenic + " " +
	    weight + " " + age + " " + sex;

	    }

    public static void main(String[] args) {

	// default constructor isn't generated after a constructor is defined
	//	Dog d = new Dog();

	Dog d = new Dog("Smith", "Poodle", true, 11.2, 10, 'm');
	Dog d1 = new Dog("Terry");
	Dog d2 = new Dog();
	System.out.println(d);
	System.out.println(d1);
	System.out.println(d2);

	// whenever we say new, we're telling Java to create a reference to
	// a new Object, a new instance
	String s1 = new String();
	String s2 = new String("COMP 1502");
	String s3 = "I'm weird!";
	s3 = "Weird's gone now";


	int x = 17;
	int y = 12;
    }

}