package ps3.factory;
/*
 * Brendan Sherman 
 */

public class BiographyMaker implements BookMaker
{
    public Book makeBook(String t, int y, String s){
        return new Biography(t, y, s);
    }
}
