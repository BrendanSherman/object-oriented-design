/*
 * Brendan Sherman 
 */

package ps4.abstract_factory;
public class BUFactory extends Factory
{
    public Book deliverPrint(String t){
        return store.deliverPrint(t);
    }

    public Book deliverDigital(String t){
        return store.deliverDigital(t);
    }
}


