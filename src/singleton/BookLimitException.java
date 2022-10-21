/*
 * Brendan Sherman
 */

package ps3.singleton;

public class BookLimitException extends Exception
{
    public BookLimitException(){
        super("Maximum borrowing reached!");
    }
}
