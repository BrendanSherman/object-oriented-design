/*
 * Brendan Sherman 
 */

package ps6.bridge;

public class Complete extends Book
{
    public Complete(String t){
        super(new CompleteImplementation(t));
    }
}


