package ps3.factory;
/*
 * Brendan Sherman 
 */

public abstract class Book implements Comparable<Book>
{
    private String title;
    private int year;
    private String subject;

    public Book(String t, int y, String s){
        title = t;
        year = y;
        subject = s;
    }

    public String getTitle(){
        return title;
    }

    public void setTitle(String t){
        title = t;
    }

    public int getYear(){
        return year;
    }

    public void setYear(int y){
        year = y;
    }

    public String getSubject(){
        return subject;
    }

    public void setSubject(String s){
        subject = s;
    }

    @Override
    public String toString(){
        return title + " " + Integer.toString(year) + " " + subject; 
    }

    @Override
    public int compareTo(Book b){
        if(year > b.getYear())
            return 1;
        else if(year < b.getYear())
            return -1;
        else
            return 0;
    }

    public abstract String genre();
}
