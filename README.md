Assignment on module 5
Title: E-Commerce Shopping Cart Manager
Problem Overview: 

You will create a simplified shopping cart application to practice core Object-Oriented Programming (OOP) concepts: Encapsulation, Immutability, State Management, etc. The complexity lies in ensuring that item quantities and prices are handled consistently across the application, especially when items are added, removed, or their quantity is changed.

Class structure:

CartItem:

productId: string: immutable unique id

name: string: immutable

unitPrice: double: immutable

quantity: integer

CartManager:

main() method

A list of CartItem representing a shopping cart.

Tasks:

1. Design a primary constructor that auto-generates the ID, and the unitPrice should be properly validated. 

2. Implement getters and setters and other necessary methods.

3. Implement features to increment and/or decrement the quantity of an item.

In the CartManager class:

4. Create 3 objects of the CartItem class with the names Egg, Milk, and Noodles, with unit prices of 10, 20, and 30, and all with an initial quantity of 0.

5. The user should be able to add Egg, Milk, or Noodles to the cart by entering 1, 2, or 3. If the item already exists in the cart, increase the quantity ( utilize the productId to check).

6. The user should be able to increment or decrement the quantity by entering 5 or 6 (This will work like the ‘+’ and ‘-’ buttons we see in e-commerce websites). The quantity of an item in the cart cannot be less than 1. 

7. The user should be able to print the entire cart in the console.

8. The user should be able to print the total payable amount in the console. 
