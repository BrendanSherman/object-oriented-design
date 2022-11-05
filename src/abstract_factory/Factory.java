/*
 * Brendan Sherman 
 */
package abstract_factory;
public abstract class Factory
{
    protected FactoryStore store;

    public Factory(){
        store = FactoryStore.makeFactoryStore();
    }

    public abstract Book deliverPrint(String t);
    public abstract Book deliverDigital(String t);
}


