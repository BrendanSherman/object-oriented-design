/*
 * Brendan Sherman
 */

package ps6.composite;
import java.util.*;

public class Series extends Book
{   
    private List<Book> bookList;

    public Series(String t){
        super(t);
        bookList = new ArrayList<Book>();
    }

    @Override
    public String toString(){
        return super.toString();
    }

    @Override
    public void addVolume(Book b){
        bookList.add(b);
    }

    @Override
    public void listTitles(){
        for(int i = 0; i < bookList.size(); i++){
            System.out.println(bookList.get(i));
        }
    }


}
