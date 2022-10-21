package ps3.factory;
/*
 * Brendan Sherman 
 */

public class Mystery extends Book
{
    public Mystery(String t, int y, String s){
        super(t, y, s);
    }

    public String genre(){
        if(this.getYear() >= 1913 && this.getYear() <= 1939)
            return "golden age";
        else
            return "hard-boiled";
    }
}
	
	
