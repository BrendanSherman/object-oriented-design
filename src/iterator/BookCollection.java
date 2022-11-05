/*
 * Brendan Sherman 
 */

package iterator;

import java.util.ArrayList;
import java.util.NoSuchElementException;

public class BookCollection
{
	private ArrayList<Book> collection;

	public BookCollection()
	{
		collection = new ArrayList<Book>();
	}

	public void addBook(Book b) throws BannedBookException
	{
		if(Book.bannedBooks().contains(b.getTitle().toUpperCase())){
			throw new BannedBookException(b.getTitle().toUpperCase());
		}
		else{
			collection.add(b);
		}
	}

	public boolean removeBook(Book b)
	{
		if (collection.contains(b)){
			collection.remove(b);
			return true;
		}
		return false;
	}

	public Book get(int index){
		return collection.get(index);
	}

	public Iterator<Book> iterator()
	{
		return new ColorIterator();
	}

	private class ColorIterator implements Iterator<Book>
	{
		private int count;

		public ColorIterator()
		{
			count = 0;
		}

		public boolean hasNext()
		{
			return count < collection.size();
		}

		public Book next()
		{
			if (hasNext())
			{
				return collection.get(count++);
			}
			else
			{
				throw new NoSuchElementException("off end of list");
			}
		}

		public boolean hasNextOfSameColor(String s)
		{
			for(int i = count+1; i < collection.size(); i++){
				if((collection.get(i).getColor()).equals(s))
					return true;	
			}	
			return false;
		}

		public Book nextOfSameColor(String s)
		{
			if(hasNextOfSameColor(s)){
				for(int i = count+1; i < collection.size(); i++){
					if((collection.get(i).getColor()).equals(s)){
						count = i;
						return collection.get(i);	
					}
				}	
			}
			throw new NoSuchElementException("No more books with specified color");
		}

		public void remove()
		{
			throw new UnsupportedOperationException("remove not implemented");
  		}
	}
}
