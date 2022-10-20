/*
 * creates a comparator for sorting books by color
 *
 * Brendan Sherman 
 */

package polymorphism;

import java.util.*;

public class BookComparator implements Comparator<Book>{
    public int compare(Book o1, Book o2){
        Book book1 = (Book)o1;
        Book book2 = (Book)o2;

        return (book1.getColor().compareTo(book2.getColor()));
    }
}
