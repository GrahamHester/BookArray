/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookarray;

public abstract class Book {
    String title;
    double price;
    
    //Constructor Accepting Title Argument
    public Book(String title){
     this.title = title;
    }
    
    //Abstract method to set price
    public abstract void setPrice();
    
    //Return title method
    public abstract String getTitle();
    
    //Return price method
    public abstract double getPrice();
    
    //Print information for a book
    public abstract void printInfo();
}