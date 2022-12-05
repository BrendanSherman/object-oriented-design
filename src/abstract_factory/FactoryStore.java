/*
 * Brendan Sherman 
 */

package ps4.abstract_factory;

public class FactoryStore
{
    private static FactoryStore store;

    private FactoryStore(){}

    public static FactoryStore makeFactoryStore(){
        if(store == null)
            store = new FactoryStore();
        return store;
    }

    public Book deliverPrint(String t, String c){
        return new Print(t, c);
    }

    public Book deliverPrint(String t){
        return new Print(t);
    }

    public Book deliverDigital(String t, String c){
        return new Digital(t, c);
    }

    public Book deliverDigital(String t){
        return new Digital(t);
    }
}


