/*
 * Brendan Sherman 
 */
package ps6.bridge;

public class CompleteImplementation extends BookImplementation 
{
    public CompleteImplementation(String t){
        super(t);
    }

    @Override
    public String toString(){
        return super.toString() + ", Complete";
    }
}
