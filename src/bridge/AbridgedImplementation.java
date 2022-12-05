/*
 * Brendan Sherman
 */

package ps6.bridge;

public class AbridgedImplementation extends BookImplementation 
{
    public AbridgedImplementation(String t, int o){
        super(t, o);
    }

    @Override
    public String toString(){
        return super.toString() + ", Abridged, " + super.getOmitted() + " omitted chapters";
    }
}


