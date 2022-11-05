/*
 * creates a Book class
 * Brendan Sherman 
 */

package iterator;

import java.util.LinkedHashSet;

public abstract class Book implements Comparable<Book>
{
    //Static Elements
    private static int bookCounter;
    private static LinkedHashSet<String> bannedTitles = new LinkedHashSet<String>();

    //instance variables and constructors
    private String title;
    private String color;
    private int numPages;
    private int rating; 

    public static int numberOfBooks(){
        return bookCounter;
    }

    public static LinkedHashSet<String> bannedBooks(){
        return bannedTitles;
    }

    public static void addBannedTitle(String title){
        bannedTitles.add(title.toUpperCase());
    }   

    public Book(String title, int numPages, String color){
        this.title = title;
        this.color = color;
        this.numPages = numPages;
        bookCounter++;
    }

    public Book(){
        this("Designing with Objects", 512, "burgundy");
    }

    public abstract int randomRating();

    //Getters and Setters 
    public int getRating(){
        return this.rating;
    }

    public void setRating(int rating){
        this.rating = rating; 
    }

    public String getTitle(){
        return this.title;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public int getPages(){
        return this.numPages;
    }

    public void setPages(int pc){
        this.numPages = pc;
    }

    public String getColor(){
        return this.color;
    }

    public void setColor(String color){
        this.color = color;
    }

    public boolean hasSamePages(Book b){
        return b.getPages() == this.numPages;
    }

    @Override
    public String toString(){
        return ("title\t" + this.title + "\ncolor\t" + this.color + "\npages\t" + this.numPages + "\nrating\t" + this.rating); 
    }

    @Override
    public boolean equals(Object o){
            if(o.getClass() == this.getClass()){
                Book b = (Book) o;
                return (this.title.equals(b.getTitle())) && (this.numPages == b.getPages());
            }
            return false;
    }

    @Override
    public int hashCode(){
        return this.title.hashCode() + this.numPages;
    }

    @Override
    public int compareTo(Book b){
        if(this.numPages > b.getPages())
            return 1;
        else if(this.numPages < b.getPages())
            return -1;
        else
            return 0;
    }
}

