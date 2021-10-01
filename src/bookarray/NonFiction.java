/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookarray;

public class NonFiction extends Book{
    
    //Constructor calling the super constructor and feeding it a title
    public NonFiction(String title){
        super(title);
        setPrice();
    }
    
    //NonFiction price is set to 37.99
    @Override
    public void setPrice(){
        price = 37.99;
    }
    
    //NonFiction book price is returned
    @Override
    public double getPrice(){
        return price;
    }
    
    //NonFiction title is returned
    @Override 
    public String getTitle(){
        return title;
    }
    
    @Override
    public void printInfo(){
        System.out.println("\n\nBook Title: " + getTitle() + "\nPrice: $" + getPrice());
    }
}