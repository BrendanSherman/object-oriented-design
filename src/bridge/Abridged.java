/*
 * Brendan Sherman
 */

package ps6.bridge;

public class Abridged extends Book
{
    public Abridged(String t, int o){
        super(new AbridgedImplementation(t, o));
    }
}


