/*
 * Brendan Sherman
 */

package singleton;

public class BookLimitException extends Exception
{
    public BookLimitException(){
        super("Maximum borrowing reached!");
    }
}
