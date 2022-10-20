/*
 * test program for Fiction
 */

package ps3.singleton;

public class FictionBorrower
{
	public static void main (String [] args)
	{
		try
		{
			System.out.println("\nTrying to borrow a mystery");
			Fiction b = Fiction.borrowFiction("Five Red Herrings",
				Genre.MYSTERY);
			System.out.println("Here's what we have signed out: ");
			System.out.println(Book.signedOut());
			System.out.println("\nTrying to borrow a fantasy");
			Fiction b2 = Fiction.borrowFiction("Harry Potter and the Sorcerer's"
				+ " Stone", Genre.FANTASY);
			System.out.println("Here's what we have signed out: ");
			System.out.println(Book.signedOut());
			System.out.println("\nThe mystery was returned.");
			Fiction.returnFiction("Five Red Herrings");
			System.out.println("Here's what we have signed out: ");
			System.out.println(Book.signedOut());
			System.out.println("\nTrying to borrow a humorous novel");
			Fiction b3 = Fiction.borrowFiction("Inimitable Jeeves",
				Genre.HUMOR);
			System.out.println("Here's what we have signed out: ");
			System.out.println(Book.signedOut());
			System.out.println("\nTrying to borrow another fantasy");
			Fiction b4 = Fiction.borrowFiction("Harry Potter and the Chamber of "
				+ "Secrets", Genre.FANTASY);
			System.out.println("Here's what we have signed out: ");
			System.out.println(Book.signedOut());
		}
		catch(BookLimitException e)
		{
			System.out.println(e.getMessage());
		}
	}
}
