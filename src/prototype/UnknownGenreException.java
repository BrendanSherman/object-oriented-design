/* 
 * Brendan Sherman 
 */

package prototype;
public class UnknownGenreException extends Exception 
{
    public UnknownGenreException(){
        super();
    }

    public UnknownGenreException(String message){
        super(message);
    }
}
