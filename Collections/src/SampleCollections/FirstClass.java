package SampleCollections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;


public class FirstClass<E> {
	
	public static void main(String[] args) {
		
	
	
	Collection<Integer> values = new ArrayList<Integer>();
	
	values.add(2);
	values.add(2);
	values.add(4);
	
	//Iterator<Integer> i = values.iterator();
	//System.out.println(i.next());
	
	for(Integer i : values)
	{
		System.out.println(i);
	}
	
	
	
	}

}
