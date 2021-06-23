package collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class ListPracticeCourser {
	
	WebDriver dr;
	
	@Test
    public <E> void courserMethods() {
		Vector<?> v=new Vector<Object>();
		Enumeration<E> e=v.elements(); // limitation -- only for legacy class2. cannot remove
		e.hasMoreElements();
		e.nextElement();
		
		
		// to overcome limitation of enumeration Iterator took place.
		Iterator<String> i=v.iterator(); // universal courser and can remove
		i.hasNext();
		i.next();
		i.remove();
		// limitation -- cannot  count, cannot go backword, cannot add while iterating
		// cannot replace
		// to overcome limitation listItearator took place
		
		// forward
		
		ListIterator<String> li=v.listIterator();
		li.hasNext();
		li.next();
		li.nextIndex();
		
		// backward
		
		li.hasPrevious();
		li.previous();
		li.previousIndex();
		
		// other
		
		li.remove();
		li.add("");
		li.set("xs");
		
		}
	// Set-- When Should go for set interface?
	//1. No duplicate --> only can take unique values.
	//2. No Insertion order ---> it takes space in memory based on hashcode value of object
	
	// (set will use collection's 12 orders)
	
	// how add () works in set?
	
	// ans: internally add() call equals () to  check whether value is duplicate or
	// not if duplicate simple it return false.
	
	// Set--> Hashset, LinkedHashset, TreeSet
	
	// Hashset                                    LinkedHashset                                TreeSet
	// 1. it follows Hashing concept.             maintain insertion order                     sorting order
	// 2. underline dataStucture--> hashtable     2.underline dataStuc..> hashtable+LinkedList   2.BalancedTree-->Comparator(customized) or comparable (default)
	// 3. Any class start with hash no insertion order  3. Any class start with linked insertion order  3. Any class start with tree always sorting order.
	// 4. Hactogenous value                        4. Hactegenus value                 4. homogenous value.
	
}
