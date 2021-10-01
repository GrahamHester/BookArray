/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookarray;

/**
 *
 * @author Graham
 */
public class Fiction extends Book{
    
    //Constructor which calls super constructor and feeds it title
    public Fiction(String title){
        super(title);
        setPrice();
    }
    
    //Fiction price is set to 24.99
    @Override
    public void setPrice(){
        price = 24.99;
    }
    
    //Fiction book price is returned
    @Override
    public double getPrice(){
        return price;
    }
    
    //Fiction title is returned
    @Override 
    public String getTitle(){
        return title;
    }
    
    @Override
    public void printInfo(){
        System.out.println("\n\nBook Title: " + getTitle() + "\nPrice: $" + getPrice());
    }
}
