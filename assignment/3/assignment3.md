# Assignment 3 - Refinements to the Hockey Time Keeper's Database

Please keep the [due dates](duedates.md) in mind.

## Updates

We will be refining your hockey time keeper's database. For this third phase we will be refactoring your code to better fulfill the principle of encapsulation, make use of interfaces, make use of collections, take command line arguments input, and make use of exceptions. We will implement new behaviour allowing the time keeper to:
* start the program with file name as an optional argument (no longer just prompting user for filename),
* players are considered unique based on their jersey number,
* sort players by a natural ordering of of jersey number for RosterTable printing,
* * lower jersey number first
* sort skaters by points, then goals, then assists (then their natural ordering) for the Skater stats in SkaterStatsTable,
* * higher points first, higher goals second, higher assists third, then lower jersey number
* sort goalies by SV% (then their natural ordering) for Goalie stats in GoalieStatsTable,
* * higher SV% first, then lower jersey number
* print out players collected by which hometown they are from with the players sorted by name (then their natural ordering) in HometownTable.
* * alphabetical name, then lower jersey number

### Interfaces

Interfaces are used when we need a contract between classes with regards to their behaviour. In particular we will convert the Table super class to become an interface instead. Each of the concrete implementations of table will now implement this interface. You should replace the previous functionality with a createTableString(PlayerList list) method.

We will take advantage of the Comparable (natural ordering), and Comparator interfaces to enable the desired sorting behaviour for each of the four tables.

### Collections

You will use collections to improve the efficiency and simplicity of your design. In particular this calls for replacing the the `List` in `PlayerList` with a collection that automatically prevents duplicates from being stored. When a new player is added overridden equals (and hashCode) methods should allow this chosen collection to prevent the adding of players with the same jersey number.

### Command-Line Options

The time keeper should be able to provide a file name for the system to use to load the list of players via one argument in the command line when the program is run. ex. `java Main inferno.team`. If the name isn't provided, or if the file isn't available, then the program should prompt the time keeper to enter a different file name or, if no filename is entered when prompted, to start with a new list of players.

### Exceptions

The system should not throw an exception if there are IO problems. If IO exceptions arise during execution, the program should prompt the time keeper and do its best to recover. This includes, but might not be limited to, files not being found, files not being readable, trouble writing files, and incorrect player information (both from the time keeper on the terminal and from a file). You will have to catch any exception thrown and properly handle it. In  file access/read cases you can exit your program gracefully with System.exit and with an error message System.err. However, for other cases such as adding a new player the program should inform the user with a System.err message, continue to run, and allow the user to give a new input.

Again we will provide you with starter files. The **Main.java** file that is already designed to take in menu choices, but has unfilled dummy functions, that you need to complete. It will be your job to complete the changes requested in this assignment and complete these dummy functions again.

[This file](assignment3_demo.txt) is a demonstration of the function of the program.

You will be given dummy classes of **Main**, **Player**, **Goalie**, **Skater**, **PlayerList**, **TeamReader**, **TeamWriter**, and **TableFactory**. You will have to re-implement **Table** as an interface and use it to create your, **RosterTable**, **SkaterStatTable**, and **GoalieStatTable** used by **TableFactory**. You will need to add an equals, hashCode, and implement Comparable<Player> for the Player class. You will also need to create 3 Comparators (for Player, Skater, Goalie) to be used in their corresponding Tables. You will need to make a new **HometownTable** for the new table type required.

You will be able to extend work you completed for assignment 2, to complete the work above. You can start use the starter code provided, or you can use your own solution to assignment 2.

## The Assignment

The assignment is due in three parts. In the first part you will fill take the information above and produce a design document for the program, in the second part you will write the tests necessary to ensure that your program is working correctly, and in the third part you will build the program.

### The Design Document (24 marks total)

Because there is very little new functionality, the Design Document will be limited. Instead we will focus on producing a class diagram for the system as well as a brief change document describing what will need to change in your implementation. Your class diagram should include all classes, with their fields and methods (including types and parameter lists). Relations should include implements, extends, association, aggregation and composition. *The drawing tool in Google Docs is very good for this*.

The Design Document will be marked with the following rubric:

#### Class Diagram

 * **Class Information**
    * 8 marks - Each class includes a name, correctly styled for the type (concrete class, abstract class, or interface), all instance variable, with types, all methods with parameter lists and return types. (You can add +/#/- public/protected/private as well if you desire)
    * 6 marks - Some classes missing some points of the above.
    * 4 marks - Information consistently missing from classes, or some classes missing documentation.
    * 2 marks - Limited information provided for all classes.
    * 0 marks - No attempt to describe the classes.
 * **Class Relations**
    * 8 marks - All classes included with correct UML relation arrows between them.
    * 6 marks - All classes included with some errors in UML relation arrows.
    * 4 marks - Some classes or UML relation arrows missing from diagram.
    * 2 marks - Limited classes and UML relation arrows provided.
    * 0 marks - No attempt to diagram the classes.

#### Change List

 * **Implementation Changes**
    * 8 marks - Complete list of changes that need to be made to existing systems to implement the required changes, including all necessary details such as the new classes and interfaces that will be needed, the code that will need to be refactored or moved and all new code that will need to be written.
    * 6 marks - Complete list of changes, lacking some detail
    * 4 marks - Partial list of changes or 
    * 2 marks - Limited list of changes.
    * 0 marks - No list of changes.

### The Unit Tests (36 marks total)

You must also test your program to ensure that it works. For this assignment you need to implement the following tests.

* **Sorting Players**
  * Sort all players by their "natural order" of jersey number.
  * Sort all players by their name (then natural ordering).
  * Sort all skaters by their points, then goals, then assists (then natural ordering).
  * Sort all goalies by their save percentage (then natural ordering).
  
* **Listing Players**
  * HometownTable createTableString (or sub-method used by it) produces a list of all hometowns and each player from that town.

* **Exceptions**
  * Failing to find file for loading PlayerList has exception handled
  * Failing to find file for saving PlayerList has exception handled
  * Incorrect player data during file loading has exception handled

* **Regression Testing**
  * Adding a new Player to **PlayerList** won't let a duplicate (same jersey number) be added.
      
The Tests will be marked with the following rubric:

* **Testing Rubric**
   * For each of the 9 tests outlined above there will be up to 4 marks given.
      * 4 marks - Test exhibits correct setup, execution and assertion phases and correctly tests the intended behaviour.
      * 3 marks - Test is mostly correctly set up, but is missing an element or does not test behaviour correctly.
      * 2 marks - Test is missing significant functionality.
      * 1 marks - Limited implementation of test.
      * 0 marks - No implementation of test.

### The System (28 marks total)

The final step of implementation will be to complete your system (notice that we design, then test, then build). You will implement the system to produce the functionality above using the design you developed in the first phase.

The system will be marked according to the following rubric:

* **System Functionality**
   * Main/PlayerList
      * 8 marks - Able to Load and Save a Player List, able to add a Goalie/Skater (but not a duplicate player). For Skaters: able to record, shots, goals (with assists) and power play goals (with assists). For Goalies: able to record, shots against, goals against, a game with minutes played, and a shutout with minutes played. 
      * 6 marks - Missing one / two functions from the above.
      * 4 marks - Has at least two functions of the above.
      * 2 marks - Has one function, but missing most.
      * 0 marks - No menu functionality added.
   * Tables
      * 8 marks - Loading from a file in the correct file, saving to a file in the correct place, creating formatted table version of PlayerList in the correct place, and that PlayerList still has the functionality need to add and get players for the menu. The four tables are sorted as requested. (Deductions possible for problems with functionality.)
      * 6 marks - Missing one function from the above.
      * 4 marks - Has at least two of the functions above
      * 2 marks - Has one function of the above.
      * 0 marks - No PlayerList/TeamReader/TeamWriter/RosterTable/SkaterStatTable/GoalieStatTable/HometownTable functionality added.

* **System Construction**
   * Design
      * 4 marks - Code follows provided design document with very minor differences.
      * 3 marks - Code follows provided design document with 1 or 2 notable differences.
      * 2 marks - Code mostly follows provided design document with several notable differences.
      * 1 mark - Code deviates significantly from design document.
      * 0 marks - Design Document or Code not submitted.
   * Encapsulation
      * 4 marks - Functionality and data are will divided between the classes. (Player duties correctly in Player/Skater/Goalie and I/O  duties in TeamReader/TeamWriter and Table duties in  RosterTableSkaterStatTable/GoalieStatTable/HometownTable)
      * 3 marks - One or two instances of functionality or data in the wrong class.
      * 2 marks - Functionality consistently  in the wrong class, to much state exposed to other classes.
      * 1 mark - Functionality inconsistently  assigned to classes.
      * 0 marks - No functionality assigned to any class.
   * Coding Style
      * 4 marks - Code follows Java standard style, members (methods and instance variables) are well named, code is styled consistently  and is easy to read, with only minor issues.
      * 3 marks - Code generally follows the above, but has one or two notable style issues.
      * 2 marks - Code has several issues in style.
      * 1 mark - Code is difficult to read and generally does not follow good style.
      * 0 marks - Code has no style.

For all rubrics we may make minor adjustments to the grades awarded depending on the situation.
