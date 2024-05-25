package Colleaction.ajp;

import java.util.List;
import java.util.Iterator;
import java.util.LinkedList;

public class DemoLinkedList {

	public static void main(String[] args) 
	{
	

List <Integer>linkList = new LinkedList<Integer>();
	linkList.add(0,10);
	linkList.add(30);
	LinkedList<Integer> list = new LinkedList<Integer>();
	list.addAll(linkList);
	Iterator<Integer> itr = list.iterator();
	while(itr.hasNext())
		
	System.out.println(itr.next());
	list.addFirst(1);
	list.add(40);
	
	System.out.println();
	System.out.println(list.indexOf(0));
	}

}
