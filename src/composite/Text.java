/*
 * Brendan Sherman
 */

package ps6.composite;

public class Text extends Book
{
    private int numEx;

    public Text(String t, int numEx){
        super(t);
        this.numEx = numEx;
    }

    @Override
    public String toString(){
        return super.toString() + " " + numEx + " exercises";
    }
}


