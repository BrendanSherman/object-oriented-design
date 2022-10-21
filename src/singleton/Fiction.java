/*
 * Brendan Sherman
 */

package ps3.singleton;

import java.util.List;
import java.util.LinkedList;

public class Fiction extends Book
{
    private Genre genre;
    private static List<Fiction> signedOutFic = new LinkedList<Fiction>();

    private Fiction(String t, Genre g){
        super(t);
        this.genre = g;
    }

    public static List<Fiction> fictionSignedOut(){
        return signedOutFic;
    }

    public static Fiction borrowFiction(String t, Genre g) throws BookLimitException{
        if(signedOutFic.size() == 2)
            throw new BookLimitException();
        Fiction f = new Fiction(t, g);
        signedOutFic.add(f);
        return f;
    }

    public static boolean returnFiction(String t){
        for(int i = 0; i < signedOutFic.size(); i++){
            Fiction f = signedOutFic.get(i);   
            if(f.getTitle() == t){
                signedOutFic.remove(f);
                return true;
            } 
        }
        return false;
    }

    public String toString(){
        return (super.getTitle() + " " + genre);
    }
}