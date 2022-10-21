/*
 * Brendan Sherman
 */

package ps3.singleton;

import java.util.List;
import java.util.LinkedList;

public class Book
{
    private String title;
    private static List<Book> signedOut = new LinkedList<Book>();

    protected Book(String t){
        this.title = t;
    }  

    public static Book borrowBook(String t) throws BookLimitException{
        if(signedOut.size() == 2)
            throw new BookLimitException();
        Book b = new Book(t);
        signedOut.add(b);
        return b;
    }
    
    public static boolean returnBook(String t){
        for(int i = 0; i < signedOut.size(); i++){
            Book b = signedOut.get(i);
            if(t.equals(b.getTitle())){
                signedOut.remove(b);
                return true;
            }
        }
        return false;
    }

    public static List<Book> booksSignedOut(){
        return signedOut;
    }
    public String getTitle(){
        return this.title;
    }

    public String toString(){
        return this.title;
    }
}
