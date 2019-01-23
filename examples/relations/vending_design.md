# Vending Machine Design

This document outlines the design for a vending machine program which allows us to simulate a working vending machine which is capable of vending different items that cost different amounts. It is also capable of accepting payment in an abstract fashion.

There are three important classes for the program. The first is the Vending Machine class which encapsulates the machine and provides the functionality of allowing a user to select an item and then pay for it and have it vended. The second is the item class which encapsulates the price and stock of an individual item within the machine, as well as the total sales of that item so far. The final class is the payment class which is responsible for managing asking the user to input money (which it does by simply asking them to type a dollar amount).

Each of the three classes are expanded upon in the following sections, begining with the item and payment classes and ending with the vending machine class which takes advantage of them both.

## Item

The item class is responsible for managing information about one item within a vending machine. When created, the item needs to know the code for the item, a String that will uniquely identify the item, the maximum stock of the item and the price at which the item sells. It is assumed that all new items have no current sales and no current stock.

The item class will need the following methods:

* `purchase` allows someone to "purchase" the item. This reduces the stock by one and adds the price to the total sales. This returns a boolean which is true if the purchase was completed and false if there was a problem. In this case the problem was that there was not enough stock of the item.
* `restock` allows someone to "restock" the item. This takes an integer, which is the amount of the item being restocked and adds that to the current stock, so long as the result is less than the maximum stock. This method returns a boolean, true if the restocking can be completed (there is enough space) and false if it cannot be restocked with that many items.
* `resetSales` allows someone to reset the sales of the item to zero. This resets the sales of the item to zero and the next time `getTotalSales` is called it will only report sales made since the last time this method was called. 

The item class also needs accessors for several values including:
* `getCode` which returns the code of the item, a string.
* `getPrice` which returns the price of the item, an decimal number.
* `getMaximumStock` which returns the maximum stock of the item, an integer.
* `getCurrentStock` which returns the current stock of the item, an integer.
* `getTotalSales` which returns the total sales of the items since the last time the the sales were reset, a decimal number.

## Payment

The playment class encapsulates how the vending machine receives payment. In this case, the user is simply prompted to enter a dollar amount which is then returned.

The payment class only has one method:

* `receivePayment` allows someone to enter payment. The user is prompted at the console to enter an amount which is parsed and returned. It returns the payment amount as a decimal number.


