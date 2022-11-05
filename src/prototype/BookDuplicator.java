package prototype;
/*
 * Brendan Sherman 
 */

public final class BookDuplicator 
{
    private Book fantasyPrototype;
    private Book humorPrototype;
    private Book textbookPrototype;
    private static BookDuplicator bd;

    private BookDuplicator(){
        try{
            fantasyPrototype = Book.makeBook("fantasy");
            humorPrototype = Book.makeBook("humor");
            textbookPrototype = Book.makeBook("textbook");
        }
        catch (UnknownGenreException g){
            System.out.println(g.getMessage());
        }
    }

    public static BookDuplicator makeBookDuplicator(){
        if(bd == null){
            bd = new BookDuplicator();
        }
        return bd;
    }

    public Book duplicateBook(String c) throws UnknownGenreException
    {
          if (c.equals("fantasy"))
          {
               return duplicateFantasyBook();
          }
          if (c.equals("textbook"))
          {
               return duplicateTextbook();
          }
          if (c.equals("humor")){
                return duplicateHumorBook();
          }
          throw new UnknownGenreException("The borrowing club is not reading " + c +" books at the moment.");
    }

    public Book duplicateFantasyBook()
    {
        Book c = null;
        try
        {
            c = (Book) fantasyPrototype.clone();
        }
        catch(CloneNotSupportedException e)
        {
        }
        return c;
    }

    public Book duplicateHumorBook()
    {
        Book c = null;
        try
        {
            c = (Book) humorPrototype.clone();
        }
        catch(CloneNotSupportedException e)
        {
        }
        return c;
    }

    public Book duplicateTextbook()
    {
        Book c = null;
        try
        {
            c = (Book) textbookPrototype.clone();
        }
        catch(CloneNotSupportedException e)
        {
        }
        return c;
    }


}
