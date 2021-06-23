package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Vector;

public class ListPractice {

    // int a=6;
	// int [] x= {5,6,7}; // fixed array
	
	Student[] s=new Student[50];
    Student [] s1=new Student[35];
    
    public void test1() {
    	s[0]=new Shohidul();
    	//s[1]="hi";
    	
    	Vector v=new Vector(); // dynamic / growable array
        v.add(7);  // limitation syncronized 
        v.add("hi");
    	
        
        // Stack--LIFO--> last in first out 
        // Hashtable --> not null key and value 
        // Properties -->
        // Dictionary -- synchronized 
        // those classes are called legacy class.
        // Enumeration is an interface to integrate through an object 
        // this is called legacy interface/courser
        
        // Java 1.0 version
        
        // Collection c=new Vector;
        // boolean add (Object o);
        // boolean addAll(Collection c);
//         boolean remove (Object o);
//         boolean removeAll(Collection c);
//         boolean contains (Object o);
//         boolean containsAll(Collection c);
//         boolean isEmpty();
//         void clear();
//         int size();
//         Object [] toArray();
//         Iterator iterator(); // iterator universal cursor! // hasNexr();, next(); 
         
        
        


        //  Java 1.2 version reshaffle --> Collection API
        //  Collection is a base interface of Collection API
        //  Collection(I)--->Clonable(I), Serializable(I)
        
        //  Collection(I)--->List(I)---> ArrayList, LinkedList, Vector, Stack.
        
//        List specific methods
//        boolean add (object o)
//        boolean addAll(Collection c);
//        boolean remove (Object o);
//        boolean removeAll(Collection c);
//        Object get(int index);
//        int indexOf(Object o);
//        int lastIndexOf(Object o);
//        boolean set(Int index,Object new obj);
//        ListIterator listIterator();
//        
        //  Collection---->Set(I)--->HashSet LinkedhashSet,TreeSet
        
 //     ArrayList a=new ArrayList(100);
   //   ArrayList a=new Arraylist(v);
        
        
        
        
        // When you should go for list-->
        //1. duplicate allow 2. insertion order preserved
        
//        ArrayList                                               Vector
//        3.not synchronized                                      3. Synchronized
//        4.not legacy class                                      4. legacy class
//        5.Underline datastructure growable array                5. same
//        6.Consecutive memory                                    6. same
//        7.implements randomAccess interface(markup)             7. same
//        8.restrival operation is best choice                    8. same
//        9.insertion and deletion is the worst choice            9. same
//        10.by default it takes 10 space in memory               10.same
   
        
        
        
//        what is limitation in ArrayList and Vector?
//        Ans: insertion and deletion is the worst choice
        
        
        // To over  insertion and deletion is the worst choice LinkedList take place
        // it has doublelinkedList memory structure
        // 1. insertion deletion best choice 
        // 2. worst choice for retrival
        
        
        // queue --> FIFO
        // Stack
        
        
       // different between arraylist vs linklist
       // insertion and deletion is the worst choice  
        
        
        
        // w linkList--> Node

      
        
        
    }
    
    
	
	
}
