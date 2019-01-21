
/**
 *
 * Demonstrates how JavaDoc works and how we use it
 * For more details take a look at the oracle page -
 * {@link https://www.oracle.com/technetwork/java/javase/tech/index-137868.html}
 *
 */


public class JavaDocTest {

    /**
     * Required Main Method for Java.
     *
     * @param args the strings that could be passed on the command-line
     */
    public static void main(String[] args) {


	

    }


    /**
     * Creates a new JavaDocTest in its default state of empty.
     */
    public JavaDocTest() {


    }

    /**
     * Create a new JavaDocTest with a string. The string is ignored.
     *
     * @param string the string that is ignored 
     */
    public JavaDocTest(String string) {

    }

    /**
     * Returns an empty string, which is pretty close to nothing, but not
     * exactly nothing.
     *
     * @return a string with no contents.
     */
    public String getNothing() {
	return "";
    }

    /**
     * Takes an integer and gives back the string "a", which is more meaningful
     * than just an empty string.
     *
     * @param a the number which is taken and ignored
     *
     * @return the string "a"
     */
    public String getNothingForInt(int a) {
	return "a";
    }



    

}