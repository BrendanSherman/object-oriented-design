package iterator;

public interface Iterator<T>
{
	boolean hasNext();
	T next();
	boolean hasNextOfSameColor(String p);
	T nextOfSameColor(String p);
}
