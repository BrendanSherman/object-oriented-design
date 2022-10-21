package ps3.factory;
/*
 * --your name--
 */

public class MysteryMaker implements BookMaker
{
    public Book makeBook(String t, int y, String s){
        return new Mystery(t, y, s);
    }
}
