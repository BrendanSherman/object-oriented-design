/*
 * Brendan Sherman 
 */

package ps4.abstract_factory;

public abstract class Book 
{
    private String title;
    private String cover; 

    public Book(String t, String c){
        this.title = t;
        this.cover = c;
    }

    public Book(String t){
        this.title = t;
    }

    public String getTitle(){
        return this.title;
    }

    @Override
    public String toString(){
        String s = "";
        s += title + ", ";
        s += this.getClass().getSimpleName();
        if(this.cover != null)
            s += ", " + this.cover;

        return s;
    }

}
