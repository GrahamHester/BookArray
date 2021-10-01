The purpose of this file is to demonstrate and practice with basic java concepts of inheritance and class abstraction. 

---UseBook Class---
The UseBook class instantiates several book objects. The key note is that objects created with Nonefiction and Fiction constructors are also of type Book. 

---Book Class---
The Book class is an abstract class which shows the functions and fields which are to be implemented later with inherited classes. Fields include title and price. All methods are abstract and include setter and getter methods for necessary fields as well as a method to print a book's information. 

---NonFiction---
NonFiction book objects are also of type book. The NonFiction constructor calls the super constructor and also calls the setPrice() method. Abstract methods from class Book are overridden and given functionality. 

---Ficiton---
The fiction class is very similar to the NonFiction class. It also inherits class Book and overrides the abstract methods with necessary operations. The primary difference is the cost of Fiction vs NonFiction books where the price of Fiction is $24.99 and NonFiction is $37.99, hence the need for overrding methods. 

How to use: 
Since the purpose is to demonstrate fundamental concepts of java, proper use of these files is at its source code. Change the source code of classes to solidify ideas of abstraction and inheritance. 