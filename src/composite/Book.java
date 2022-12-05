/*
 * Brendan Sherman 
 */

package ps6.composite;

public abstract class Book 
{
    private String title;

    public Book(String t){
        this.title = t;
    }

    @Override
    public String toString(){
        return title;
    }

    public void addVolume(Book b) throws InapplicableOperationException{
        throw new InapplicableOperationException("error");
    }

    public void listTitles() throws InapplicableOperationException{
        throw new InapplicableOperationException("errorr");
    }
}
