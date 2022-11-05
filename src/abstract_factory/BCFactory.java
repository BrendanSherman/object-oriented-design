/*
 * Brendan Sherman 
 */

package abstract_factory;

import java.util.*;

public class BCFactory extends Factory
{
    private final String[] covers = {"Baldwin the Eagle", "BC Eagles", "Heights"};

    //Returns random cover
    public String getRandom(){
        Random r = new Random();
        return covers[r.nextInt(0, 3)];
    }

    public Book deliverPrint(String t){
        return store.deliverPrint(t, getRandom());
    }

    public Book deliverDigital(String t){
        return store.deliverDigital(t, getRandom());
    }
}


