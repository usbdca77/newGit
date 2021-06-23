package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.apache.commons.math3.util.MultidimensionalCounter.Iterator;
import org.testng.annotations.Test;

public class HashSet {
       
	@Test
	public void test2() {
		HashSet h=new HashSet();
		int a[]= {5,6,7,8,8,45,7,8};
		for (int x:a) {
			if(h.add(x)==false) {
				System.out.println(x);
			}
		}
	}
		
//		Iterator i= h.iterator();
//		while(i.hasNext()) {
//			System.out.println();
//		}
		
		@Test
		public void test3() {
			ArrayList<String> a=new ArrayList<String>();
			a.add("dog");
			a.add("chicken");
			a.add("tiger");
			Collections.sort(a,new A());
			java.util.Iterator<String> i1=a.iterator();
			while(i1.hasNext()) {
				System.out.println(i1);
			}
			
		}
		
	}
	


class A implements Comparator<String>{
	public int compare(String a, String b) {
		if(a.length()>b.length()) {
			return -1;
			
		}else if (a.length()<b.length()) {
			return 1;
		}else
		return 0;
	}
	
	




@Test
public void testMap() {
	// map is an interface which based on key and value pairs.
	// one key and value pairs means one entry.
	// Entry is a subclass of Map.
	
	// Map-->hashMap, Hashtable, LinkedHashMap, TreeMap, ConcurrentHashMap
	
	   Map<Integer, String> m=new HashMap();
	   Map<Integer, String> m1=new HashMap();
	   
	   
	  // Map specific methods:
	   m.clear();
	   m.containsKey(1);
	   m.containsValue("hi");
	   m.equals(m1);
	   Set<Entry<Integer,String>>kv=m.entrySet();
	   
	   
	   m.get(1);
	   m.hashCode();
	   m.isEmpty();
	   Set<Integer>k=m.keySet();
	   m.put(1, "hi");
	   Object v=m.put(1, "helloo"); // put method call equals method to check
	   // key is duplicate or not.
	   // if duplicate new value will be updated with old value and old value will be return value
	   Object o=m.get(1);
	   System.out.println(o);//hello
	   System.out.println(v);//hi
	   m.putAll(m1);
	   Collection<String>c=m.values();
	   m.size();
	   //m.remove(1);
	   
	   
	   // key and value
	   Iterator<Entry<Integer, String>> i=m.entrySet().iterator();
	   while(i.hasNext) {
		   Entry<Integer, String> e=i.next();
		   System.out.println(e.getKey());
		   System.out.println(e.getValue());
	   
	   
	   // all key
	   Iterator<Integer> i1=m.keySet().iterator();
	   while(i1.hasNext) {
		   Integer e1=i.next();
		   System.out.println(e1);
		   
	   }
	   	 
	  // all values
	   
	   Iterator<String> i2=m.values().iterator();
	   while(i2.hasNext) {
		   Integer e2=i.next();
		   System.out.println(e2);
		   System.gc();
		   Object o;
	   }
	   }
	   

   
 }
       @Test
	   public void countchar() {
		   HashMap<Character, Integer> hp=new HashMap();
		  String sent="united state of america";
		  char []c=sent.toCharArray();
		  for(Character x:c) {
			  if(hp.containsKey(x)) {
				  hp.put(x, hp.get(x)+1);
			  }else
			  hp.put(x, 1);	
		  }
		  
		  Iterator<Entry<Character, Integer>> i=hp.entrySet().iterator();
		   while(i.hasNext) {
			   Entry<Character, Integer> e=i.next();
			   System.out.println("key is" +e.getKey());
			   System.out.println("value" +e.getValue());
 
		  
		  
	   }

   
    	
       }
}

