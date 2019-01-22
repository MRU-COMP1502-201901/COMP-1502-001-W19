# Assignment 1 - Creating a Hockey Time Keeper's Database

Over the course of the assginments in this course this semester we will construct a simple application that works as a hockey Time Keeper's database. For this first phase we will construct the basic components needed to keep track of hockey player data and allow the time keeper to record, shots, goals and power-play goals for each player on a team.

For the first phase, the time keeper should be able to load a list of players, add a new player, list the players' roster information and list the players' stats. The timer keeper should also be able to record a player's shot, a goal with one or two assists, and a power play goal, with one or two assists. 

[This file](assignment1_demo.md) is a demonstration of the function of the program.

For the first phase, you will be provided with code that will provide a menu for the time keeper and stubs of methods to tie together the menu with the code you will write.

You will be responsible for creating a `Player` class to encapsulate a player and a `Player List` class to encapsulate a list of players, and for connecting those classes to the menu to provide the functionality.

## The Classes

### Player

For each player there are two types of information we want to keep, roster information and play information. Roster information includes information about the player including:
* their name, 
* date of birth, 
* home town, 
* weight, 
* height, 
* number,
* and position (left wing (LW), right wing (RW), centre (C), or defence (D).

For simplicity's sake, assume that all of their roster information will be stored as strings (including birth date and height). You can use a String to encode their posisition or you can use an **enum**.

Play information includes information about what they've done in the games they've played. This includes:

* their points (goals and assists together),
* goals,
* assists,
* power play points (power play goals and assists together),
* power play goals,
* power play points,
* shots,
* and shooting percentage (for all of their shots what percent are goals?).

Notice that some of these values can be stored, while others should be derived. **You are responsible for determining which is which and providing algorithms to determine each.**

Your Player class will need three constructors:
* A "roster" constructor, which will take the information needed to provide all of the player's roster information.
* A "recreation" constructor, which will take all of the player information including roster and play information.
* A "copy" constructor, which will take another player object and set all of the values in the new player to be the same as the original.

You might also want to make a constructor that takes a string which can be broken down to extract each piece of information needed to construct the Player.

### Player Lists 

To keep track of the players we will want a Player List which will wrap an ArrayList class and allow us to use the player information in aggregate. 

For the time being we will ignore teams, so each player's jersey number will be unique, we will use this information to uniquely identify players.

Your system needs to be able to save a list of players to a file and to be able to read in a file and get back a list of players. You should also be able to add a new player to the list. Finally you should be able to record a goal for a player, assists for players (and the same for power play) and shots. In order to that you will also need a method to find a player in the list.

One approach would be to create a constructor that takes a file, then reads that file to populate a the list of players. An alternative would be to read in the list of players in the interface class and pass that list to the Player List class when it is created. (Both are acceptable, in your design document be sure to explain why you chose the approach you chose).

An example player data [file](inferno.team) has been provided for you, it is roster and stats information taken from the Calgary Inferno, a team in the Canadian Women's Hockey League. 
   * The data is taken from the CWHL [website](http://www.thecwhl.com/stats/player-stats/1/22?playertype=skater&position=skaters&rookie=no&sort=points&statstype=standard&page=1&league=1), which does not provide a breakdown of player's posiition, so we have provided some "artificial" positions for the forwards. Shots are also not recorded, so each player has been provided a roughly estimated number of shots.
   * The data is comma seperated, with one field for each data item. You can use the following snippit of code to produce an ArrayList of each of the elements in one line 
   ````
   ArrayList<String> data = 
    			new ArrayList<>(Arrays.asList(playerString.split(",")));
   ````
   * The format for the file is,
      * Name,
      * Position,
      * Jersey Number,
      * Date of Birth,
      * Home Town,
      * Height,
      * Goals,
      * Assists,
      * Power Play Goals,
      * Power Play Assists,
      * Shots
   * You are welcome to use this file format, or to adapt your own if you would like to record the information differently. Note that it is assumed that each field will not contain commas (so no comma after Calgary in Calgary AB) and will not contain any double quotes.

### Interface

In the interface class (Main) there are several stub methods provided, which will allow you to connect your code to the menu. In particular you will need to:

* List all of the player's roster information
* List all of the player's statistics information
* Add a new player
* Record a shot
* Record a goal (with up to 2 assists)
* Record a power play goal (with up to 2 assists)

## The Assignment

The assignment is due in three parts. In the first part you will fill take the information above and produce a design document for the program, in the second part you will write the tests necessary to ensure that your program is working correctly, and in the third part you will build the program.

### The Design Document (48 marks total)

Your design document needs to come in two parts, **1) The Public Interface** for the Player List and Player classes and the **2) Implementation Details** for both of those classes.

For the public interface, for each class, you must describe provide a description including, what information the class is encapsulating, what the function of the class is, how the class interacts with other classes and what assumptions you've made regarding the design of the class.

You also need to list the methods you will include in your classes. 

For each method you must list:
* a one sentence purpose describing what the method does, 
* an indepth description of the method including the use of the method, any relevent algorithms or mathematics, any limitations of the method or assumptions about how the method will be able to work with other parts of your program
* a list of the method's arguments with a description of what each argument means
* a description of what the method returns

Your public interface descriptions should be written in plain english and should allow a reader to quickly understand the purpose and use of each class and method. You can model your public interface for the other two classes on the document provided for the Interface class.

For the implementation details, for each class, you should describe what information will make up the state of an object (the instance variables) and how that information will be used. For each method you should include any information you need to about implementing the method. Again you should write your details in plain english, being as specific as possible. Someone reading your document should be able to understand enough to implement the whole class or any particular method.

Your design document should be your guide testing and building your system. We expect that as you work you will build your system to reflect what you proposed in your design. However it is often the case that when workin on tests or development, you will discover something you did not consider when desiging. In these cases you are welcome to update your design document, along with a not regarding why you decided to make the change.

The Design Document will be marked with the following rubric:

**The Public Interface**

 * **The Player Class**
    * The Class Description
       * 4 marks - Provides a description of the class, detailed description of the encapsulated information, detailed description of the role of the class and its interaction, and the assumptions made regarding the design of the class.
       * 3 marks - Provides a description of the class, detailed description of the encapsulated information, detailed description of the role of the class and its interaction, and the assumptions made regarding the design of the class, but one of these topics is omitted.
       * 2 marks - Provides a description of the class, detailed description of the encapsulated information, detailed description of the role of the class and its interaction, and the assumptions made regarding the design of the class, but several of these topics are omitted, or discussed only in low detail.
       * 1 marks - Provides a description of the class, with only limited description of the encapsulated information, detailed description of the role of the class and its interaction, or the assumptions made regarding the design of the class.
       * 0 marks - No attempt to describe the Player class.
    * The Method Descriptions
       * 10 marks - Provides detailed information for each method, including purpose, description with assumptions, arguments, , and return values. If methods are left out (for any , this grade will be lowered by the same percentage.
       * 8 marks - Provides detailed information for each method, including purpose, description with assumptions, arguments, , and return values, but is missing information from 1 or 2 methods.
       * 6 marks - Provides detailed information for each method, including purpose, description with assumptions, arguments, , and return values, but is missing information from all methods.
       * 4 marks - Provides some information regarding each method.
       * 2 marks - Provides a list of all methods.
       * 0 marks - No attempt to describe the methods of the Player class.
    * The Implementation Details
       * 8 marks - Provides a full description of the internal state of the class and for all methods there is a plan for implementation or an algorithm provided.
       * 6 marks - Provides a full description of the internal state of the class and for all methods there is a plan for implementation or an algorithm provided, but is missing 1 or 2 elements.
       * 4 marks - Provides a full description of the internal state of the class or provides a plan for implementation for each method, but is missing one or the other.
       * 2 marks - Provides a limited description of the internal state, but no description of implementation of the methods.
       * 0 marks - No attempt to describe the implemenation.


 * **The Player List Class**
    * The Class Description
       * 4 marks - Provides a description of the class, detailed description of the encapsulated information, detailed description of the role of the class and its interaction, and the assumptions made regarding the design of the class.
       * 3 marks - Provides a description of the class, detailed description of the encapsulated information, detailed description of the role of the class and its interaction, and the assumptions made regarding the design of the class, but one of these topics is omitted.
       * 2 marks - Provides a description of the class, detailed description of the encapsulated information, detailed description of the role of the class and its interaction, and the assumptions made regarding the design of the class, but several of these topics are omitted, or discussed only in low detail.
       * 1 marks - Provides a description of the class, with only limited description of the encapsulated information, detailed description of the role of the class and its interaction, or the assumptions made regarding the design of the class.
       * 0 marks - No attempt to describe the Player class.
    * The Method Descriptions
       * 10 marks - Provides detailed information for each method, including purpose, description with assumptions, arguments, , and return values. If methods are left out (for any , this grade will be lowered by the same percentage.
       * 8 marks - Provides detailed information for each method, including purpose, description with assumptions, arguments, , and return values, but is missing information from 1 or 2 methods.
       * 6 marks - Provides detailed information for each method, including purpose, description with assumptions, arguments, , and return values, but is missing information from all methods.
       * 4 marks - Provides some information regarding each method.
       * 2 marks - Provides a list of all methods.
       * 0 marks - No attempt to describe the methods of the Player class.
    * The Implementation Details
       * 8 marks - Provides a full description of the internal state of the class and for all methods there is a plan for implementation or an algorithm provided.
       * 6 marks - Provides a full description of the internal state of the class and for all methods there is a plan for implementation or an algorithm provided, but is missing 1 or 2 elements.
       * 4 marks - Provides a full description of the internal state of the class or provides a plan for implementation for each method, but is missing one or the other.
       * 2 marks - Provides a limited description of the internal state, but no description of implementation of the methods.
       * 0 marks - No attempt to describe the implemenation.

 * **The Document**
    * Readability
       * 4 marks - The Design Document is written in clear, easy to read text, with very few gramaticial errors.
       * 3 marks - The Design Document is written in clear, easy to read text, with several gramatical errors or other problems that limit readability.
       * 2 marks - The Design Document is not written in clear, easy to read text, but is sufficiently readable that it can be understood.
       * 1 mark - The Design Document is hard to read.
       * 0 marks - The Design Document is impossible to read.
    * Use of Style
       * 4 marks - The Design Document is presented in a clear style using GitHub markdown, that makes it easy to read and understand
       * 3 marks - The Design Document makes good use of markdown with only a few style issues.
       * 2 marks - The Design Document makes some use of markdown,
       * 1 mark - The Design Document doesn't make use of markdown, is presented in plain text or using some other style system.
       * 0 marks - The Design Document was not submitted.

### The Unit Tests (44 marks total)

You must also test your program to ensure that it works. In later assignments you will be responsible for developing and implementing a full test plan. For this assignment you need to implement the following tests.

* **Player Class**
   * Constructor
      * Test each of the constructors by creating a new Player and getting values back from each getter method.
   * Points
      * Test recording assist. When an assist is recorded, the assists and points should both go up by one.
      * Test recording goal. When a goal is recorded, the goals, points and shots should both go up by one.
   * Power Play Points
      * Test recording Power Play assist. When an PP assist is recorded, the PP assists and points should both go up by one.
      * Test recording Power Play goal. When a PP goal is recorded, the PP goals, points and shots should both go up by one.
   * Shooting Percent
      * Test recording a shot. When a shot is recorded, the shooting percentage should go down (but not below 0).
      * Test recording a goal. When a goal is recorded, the shooting percentage should go up (but not above 100).
* **Player List Class**
   * Adding a Player
      * Test adding a new player. After adding you should be able to get the player back using the player number.
   * Recording a Goal
      * Test recording a goal with no assists. After, you should see that the scoring player has an extra goal, point and shot.
      * Test recording a goal with 1 assist. After, you should see that the scoring player has an extra goal, point and shot. The assisting player should have an extra assist and point.
      * Test recording a goal with 2 assists. After, you should see that the scoring player has an extra goal, point and shot. The assisting players should have an extra assist and point.
      
The Tests will be marked with the following rubric:

* **Testing Rubric**
   * For each of the 11 tests outlined above there will be up to 4 marks given.
      * 4 marks - Test exhibits correct setup, execution and assertion phases and correctly tests the intended behaviour.
      * 3 marks - Test is mostly correctly set up, but is missing an element or does not test behaviour correctly.
      * 2 marks - Test is missing significant functionality.
      * 1 marks - Limited implementation of test.
      * 0 marks - No implementation of test.

### The System (40 marks total)

The final step of implementation will be to complete your system (notice that we design, then test, then build). You will implement the system to produce the functionality above using the design you developed in the first phase.

The system will be marked according to the following rubric:

* **System Functionality**
   * Main
      * 8 marks - Able to Load and Save a Player List, able to add a Player, able to record, shots, goals (with asssits) and power play goals (with assists), able to list player roster and player stats. (Deductions possible for problems with functionality.)
      * 6 marks - Missing one / two functions from the above.
      * 4 marks - Has at least two functions of the above.
      * 2 marks - Has one function, but missing most.
      * 0 marks - No menu functionality added.
   * Player List
      * 8 marks - Able to load from a file, able to save to a file, able to add a player to the list, able to record a shot, goal and power play goal (with assists). (Deductions possible for problems with functionality.)
      * 6 marks - Missing one function from the above.
      * 4 marks - Has at least two of the functions above
      * 2 marks - Has one function of the above.
      * 0 marks - No Player List functionality added.
   * Player
      * 8 marks - Has at least 3 constructors, has getters for all needed values, has setters for appropriate values, able to calculage points, power play points and shooting percentage, able to record a shot, assist, goal (and power play assists and goals).
      * 6 marks - Missing one / two function from the above.
      * 4 marks - Has at least two of the functions above
      * 2 marks - Has one function of the above.
      * 0 marks - No Player List functionality added.      

* **System Construction**
   * Design
      * 4 marks - Code follows provided design document with very minor differences.
      * 3 marks - Code follows provided design document with 1 or 2 notable differences.
      * 2 marks - Code mostly follows provided design document with several notable differences.
      * 1 mark - Code deviates significantly from design document.
      * 0 marks - Design Document or Code not submitted.
   * Encapsulation
      * 4 marks - Functionality and data are will divided between the Player and Player List classes.
      * 3 marks - One or two instances of functionality or data in the wrong class.
      * 2 marks - Functionality consistantly in the wrong class, to much state exposed to other classes.
      * 1 mark - Functionality inconsistantly assigned to classes.
      * 0 marks - No functionality assigned to any class.
   * Coding Style
      * 4 marks - Code follows Java standard style, members (methods and instance variables) are well named, code is styled consistantly and is easy to read, with only minor issues.
      * 3 marks - Code generally follows the above, but has one or two notable style issues.
      * 2 marks - Code has several issues in style.
      * 1 mark - Code is difficult to read and generally does not follow good style.
      * 0 marks - Code has no style.
   * Git Usage
      * 4 marks - Each commit of code is small and logically consistant. 
      * 3 marks - Commits are larger or have several different changes grouped together.
      * 2 marks - Commits are large and occasional with many different changes grouped together.
      * 1 mark - One or two commits for the whole assignment.
      * 0 marks - Git was not used.
     
For all rubrics we may make minor adjustments to the grades awarded depending on the situation.
