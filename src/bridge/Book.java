/*
 * Brendan Sherman
 */

package ps6.bridge;

public abstract class Book 
{   
    private BookImplementation imp;

	public Book(BookImplementation imp){
        this.imp = imp;
    }

    public String getTitle(){
        return imp.getTitle();
    }

    public void setTitle(String t){
        imp.setTitle(t);
    }

    public int getOmittedChapters(){
        return imp.getOmitted();
    }

    public void setOmittedChapters(int o){
        imp.setOmitted(o);
    }

    @Override
    public String toString(){
        return imp.toString();
    }
}


