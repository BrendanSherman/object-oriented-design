/* 
 * program for testing BookCollection
 */

package iterator;

public class BookCollectionTest
{
	public static void main (String [] args)
	{
		try
		{
			// store banned books
			String [] banned = {"Catcher in the Rye", "To Kill a Mockingbird",
				"Grapes of Wrath", "Brave New World"};
			for (int i = 0; i < banned.length; i++)
			{
				Book.addBannedTitle(banned[i]);
			}

			// create book collection
			BookCollection books = new BookCollection();
			Book b1 = new NonFiction();
			Book b2 = new Fiction("And Then There Were None", 288, "black", 
				Genre.MYSTERY);
			Book b3 = new Fiction("Harry Potter and the Sorcerer's Stone", 
				223, "brown", Genre.FANTASY);
			Book b4 = new NonFiction();
			Book b5 = new Fiction("Murder on the Orient Express", 212, 
				"black", Genre.MYSTERY);
			Book b6 = new NonFiction("Mastering the Art of French Cooking", 
				68, "green", 641);
			Book b7 = new Fiction("Inimitable Jeeves", 253, "ecru", 
				Genre.HUMOR);
			Book b8 = new Fiction("Murder of Roger Ackroyd", 288, "black", 
				Genre.MYSTERY);
			Book [] toAdd = {b1, b2, b3, b4, b5, b6, b7, b8};
			for (Book b: toAdd)
			{
				books.addBook(b);
			}

			// use iterator to traverse
			System.out.println("\nHere are the books in our collection, along "
				+ "with their cover colors:\n");
			Iterator<Book> iter = books.iterator();
			while (iter.hasNext())
			{
				Book b = iter.next();
				System.out.printf("%-12s%s\n", b.getColor(), b.getTitle());
			}

			// use iterator to traverse by specified color
			iter = books.iterator();
			String color = "black";
			System.out.println("\nLet's see what books we have with " + color 
				+ " covers:\n");
			while (iter.hasNextOfSameColor(color))
			{
				Book b = iter.nextOfSameColor(color);
				System.out.printf("%-12s%s\n", b.getColor(), b.getTitle());
			}

			// get book at specified index
			System.out.println("\nLet's take the seventh book off the shelf:");
			System.out.println(books.get(6).getTitle());

			// remove specified book
			System.out.println("\nOur neighbor wants to borrow it, so let's"
				+ " remove it:\n");
			books.removeBook(books.get(6));
			iter = books.iterator();
			while (iter.hasNext())
			{
				System.out.println(iter.next().getTitle());
			}

			// try to add banned book to collection
			System.out.println("\nLet's add 'Brave New World' to our"
				+ " collection");
			Book b9 = new Fiction("Brave New World", 234, "black",
				Genre.FANTASY);
			books.addBook(b9);
		}
		catch (BannedBookException e)
		{
			System.out.println(e.getMessage());	
		}
	}
}
