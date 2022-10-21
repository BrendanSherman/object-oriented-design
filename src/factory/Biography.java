package ps3.factory;
/*
 * Brendan Sherman 
 */

public class Biography extends Book
{
    public Biography(String t, int y, String s){
        super(t, y, s);
    }

    public String genre(){
        return "memoir";
    }

}