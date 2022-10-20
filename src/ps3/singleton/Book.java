/*
 * Brendan Sherman
 */

package ps3.singleton;

import java.util.List;
import java.util.LinkedList;

public class Book
{
    private String title;
    private static List<String> signedOut = new LinkedList<String>();

    protected Book(String t){
        this.title = t;
    }  

    public static Book borrowBook(String t) throws BookLimitException{
        if(signedOut.size() == 2)
            throw new BookLimitException();
        signedOut.add(t);
        return new Book(t);
    }
    
    public static boolean returnBook(String t){
        if(signedOut.contains(t)){
            signedOut.remove(t);
            return true;
        }
        return false;
    }

    public static List<String> signedOut(){
        return signedOut;
    }
    public String getTitle(){
        return this.title;
    }

    public String toString(){
        return this.title;
    }
}