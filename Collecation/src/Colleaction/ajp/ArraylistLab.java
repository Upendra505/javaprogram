package Colleaction.ajp;
import java.util.ArrayList;
import java.util.*;
import java.util.List;

public class ArraylistLab 
{
	public static void main(String args[])
	{
		List list = new ArrayList(); // creating Array object
		list.add(10); // adding the value in arraylist
		list.add(3.14);
		list.add('a');
		list.add("Avanthi");
		System.out.println(list);
		System.out.println(list.size());//list size
		System.out.println(list.set(1, 10));//index location to store values
		list.add(2,25);
		list.remove(4);//remove the values in arraylist
		list.add(null);
		list.add(10);//duplicate values 
		
		System.out.println(list.contains(10));
		System.out.println(list);
	    Iterator itr = list.iterator();	
	
		while(itr.hasNext())
			System.out.println(itr.next());
	
	}

}
