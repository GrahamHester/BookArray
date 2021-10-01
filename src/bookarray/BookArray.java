/*
    This file demonstrates the creation of multiple fiction and nonfiction book objects
    which are also of the Book type 
 */
package bookarray;

public class BookArray {
    
    public static void main(String[] args) {
        
        //Array of fiction and nonfiction books in an array of type Book
        Book[] books = {new Fiction("White Oliander"), new NonFiction("The Art of Lamps"), new Fiction("Mother Goose"), new NonFiction("Obama"),
                        new Fiction("Bridge to Terabithia"), new Fiction("Lord of The Rings: The Fellowship of the Ring"), new NonFiction("Penguin Facts"),
                        new Fiction("Penguin Lies"), new NonFiction("Rocks"), new NonFiction("Trees and Their Various Uses for Construction of Household Furniture")};
        
        //Output information for each item in the books array
        for(Book book: books){
            book.printInfo();
        }
    }
    
}
