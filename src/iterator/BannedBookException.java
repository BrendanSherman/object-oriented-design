/*
 * Brendan Sherman 
 */

package iterator;

public class BannedBookException extends Exception
{
    public BannedBookException(){
        this("UNSPECIFIED");
    }

    public BannedBookException(String s){
        super(s + " is a banned book and may not be added to your collection!");
    }
}
