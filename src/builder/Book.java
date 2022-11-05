package builder;
/*
 * Brendan Sherman 
 */

public class Book
{
    private String title;
    private int pages;
    private String author;
    private int year;

    private Book(Builder b){
        this.title = b.title;
        this.pages = b.pages;
        
        if(b.author != null)
            this.author = b.author;
        if(b.year != 0)
            this.year = b.year;
    }

    @Override
    public String toString(){
        String s = "";
        if(title != null)
            s += title + " ";
        if(pages != 0)
            s += Integer.toString(pages) + " ";
        if(author != null)
            s += author + " ";
        if(year != 0)
            s += Integer.toString(year);
        return s;
    }

    public static class Builder{
        String title;
        String author;
        int pages;
        int year;
    
        public Builder(String title, int pages){
            this.title = title;
            this.pages = pages; 
        }
    
        public Builder author(String author){
            this.author = author;
            return this;
        }
    
        public Builder year(int year){
            this.year = year;
            return this;
        }
    
        public Book build(){
            return new Book(this);
        }
    }
}


