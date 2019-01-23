# Vending Machine Design

This document outlines the design for a vending machine program which allows us to simulate a working vending machine which is capable of vending different items that cost different amounts. It is also capable of accepting payment in an abstract fashion.

There are three important classes for the program. The first is the Vending Machine class which encapsulates the machine and provides the functionality of allowing a user to select an item and then pay for it and have it vended. The second is the item class which encapsulates the price and stock of an individual item within the machine, as well as the total sales of that item so far. The final class is the payment class which is responsible for managing asking the user to input money (which it does by simply asking them to type a dollar amount).

Each of the three classes are expanded upon in the following sections, begining with the item and payment classes and ending with the vending machine class which takes advantage of them both.
