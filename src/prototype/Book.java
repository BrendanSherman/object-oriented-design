/*
 *   Brendan Sherman 
 */

package ps4.prototype;

public class Book implements Cloneable 
{
    private String title;
    private String author;
    private int year;

    private Book(String g) throws UnknownGenreException{
        if(g.equals("fantasy")){
            this.title = "Harry Potter and the Philosopher's Stone";
            this.author = "Rowling";
            this.year = 1996;
        }
        if(g.equals("humor")){
            this.title = "Inimitable Jeeves";
            this.author = "Wodehouse";
            this.year = 1923;
        }
        if(g.equals("textbook")){
            this.title = "Designing with Objects";
            this.author = "Kak";
            this.year = 2014;
        }
    }

    public String getTitle(){
        return this.title;
    }

    public static Book makeBook(String g) throws UnknownGenreException{
        return new Book(g);
    }

    public Object clone() throws CloneNotSupportedException{
        return (Book) super.clone();
    }

    @Override
    public boolean equals(Object b){
        if(this.getClass() == b.getClass()){
            Book a = (Book) b;
            return (this.title.equals(a.getTitle()));
        }
        return false;
    }

    public void setTitle(String t){
        this.title = t;
    }

    public void setYear(int y){
        this.year = y;
    }

    @Override
    public String toString(){
        String s = "";
        s += (title + ", " + author + ", " + year);
        return s;
    }
}
