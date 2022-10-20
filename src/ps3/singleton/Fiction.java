/*
 * Brendan Sherman
 */

package ps3.singleton;


public class Fiction extends Book
{
    private Genre genre;

    private Fiction(String t, Genre g){
        super(t);
        this.genre = g;
    }

    public static Fiction borrowFiction(String t, Genre g) throws BookLimitException{
        if(Book.signedOut().size() == 2)
            throw new BookLimitException();
        Fiction f = new Fiction(t, g);
        Book.signedOut().add(f.toString());
        return f;
    }

    public static boolean returnFiction(String t){
        for(int i = 0; i < Book.signedOut().size(); i++){
            if(Book.signedOut().get(i).contains(t)){
                Book.returnBook(Book.signedOut().get(i));
                return true;
            }
        }
        return false;
    }

    public String toString(){
        return (super.getTitle() + " " + genre);
    }
}
