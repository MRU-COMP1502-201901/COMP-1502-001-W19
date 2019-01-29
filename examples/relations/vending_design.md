# Vending Machine Design

This document outlines the design for a vending machine program which allows us to simulate a working vending machine which is capable of vending different items that cost different amounts. It is also capable of accepting payment in an abstract fashion.

## Public Interface

There are three important classes for the program. The first is the Vending Machine class which encapsulates the machine and provides the functionality of allowing a user to select an item and then pay for it and have it vended. The second is the item class which encapsulates the price and stock of an individual item within the machine, as well as the total sales of that item so far. The final class is the payment class which is responsible for managing asking the user to input money (which it does by simply asking them to type a dollar amount).

Each of the three classes are expanded upon in the following sections, beginning with the item and payment classes and ending with the vending machine class which takes advantage of them both.

### Item

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

### Payment

The payment class encapsulates how the vending machine receives payment. In this case, the user is simply prompted to enter a dollar amount which is then returned. The payment class doesn't need any new 

The payment class only has one method:

* `receivePayment` allows someone to enter payment. The user is prompted at the console to enter an amount which is parsed and returned. It returns the payment amount as a decimal number.

### VendingMachine

The vending machine encapsulates the information and behaviour needed to simulate a vending machine. The class holds a list items and a payment system. It allows a user to query for the items, query for prices, and purchase an item. A new Vending Machine starts needs to be given a payment class object, and otherwise starts with no items.

The methods needed for the vending machine are:
* `addItem` adds a new item to the vending machine. If the item has a unique item code, compared to all other items currently in the vending machine the item is added, otherwise it is not added. The method returns true if the item could be added and false otherwise.
* `listAllItems` lists all of the items in the vending machine to the console. Each item is printed with it's code price and stock, one per line.
* `getItemInfo` lists information about an item, including the code, price, current stock and maximum stock. This method takes an item code to look up, then finds that item and prints its relevant information.
* `purchaseItem` allows an item to be purchased. This method takes an item code to look up, then finds that item and prints the price to the console, it then calls the payment object to take payment from the user. If the payment is sufficient then it attempts to purchase the item, if the item can be purchased then a message to that effect is printed to the console, otherwise an appropriate error message is printed.
* `restockItem` allows an item to be restocked. This method takes an item code to look up and an amount to restock. It finds the appropriate item and attempts to restock it. It prints whether or not it succeeded to the console.
* `getTotalSales` returns the total sales for the vending machine. It adds together the total sales of each item in the machine and returns the number as a double.
* `resetSales` resets the sales of all of the items in the machine. For each item it resets the sales, so the next time `getTotalSales` is called it will return all sales after this point.

## Private Implementation

### Item Class

The item class needs to store:
* An item code - String
* A price - double
* An on-hand stock - int
* A maximum stock - int
* A total sales - double

The item code, price, and maximum stock should be set when creating the new item. The on-hand stock should be increased by the `restock` method (up to, but not over the maximum stock) and should be decremented by the `purchase` method. 

**Important Methods**
* `purchase` - should subtract one from the on-hand stock (so long as that's above zero) and add the price to the total sales. If it's not able to take one from stock the method should return false, otherwise true.
* `restock` - should add a new amount to the on-hand stock (so long as the *sum of the existing stock plus the new stock* is less than the maximum stock. If it's not able to add the new stock it should not change the amount on hand, and should return false, otherwise it should return true.
* `resetSales` should reset the total sales to zero. 

Each of the fields should have a getter method, that returns the value unaltered.
 


