/*
 * Brendan Sherman 
 */

package ps6.bridge;

public abstract class BookImplementation
{
    private String title;
    private int numOmitted;

    public BookImplementation(String title){
        this.title = title;
    }

    public BookImplementation(String title, int omitted){
        this.title = title;
        this.numOmitted = omitted;
    }

    public String getTitle(){
        return title;
    }

    public void setTitle(String t){
        title = t;
    }

    public int getOmitted(){
        return numOmitted;
    }

    public void setOmitted(int omitted){
        numOmitted = omitted;
    }

    @Override
    public String toString(){
        return title;
    }
}


