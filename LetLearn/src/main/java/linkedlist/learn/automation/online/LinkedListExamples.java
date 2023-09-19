package linkedlist.learn.automation.online;

import java.util.LinkedList;

public class LinkedListExamples {

	public static void main(String[] args) {
		
		LinkedList<String> month = new LinkedList<String>();
		month.add("Jan");
		month.add("Feb");
		month.add("Mar");
		month.add("Apr");
		month.add("May");
		month.add("May");
		
		System.out.println(month);
		month.addFirst("Month");
		System.out.println(month);
		month.addLast("Jun");
		System.out.println(month);
		System.out.println(month.getFirst());
		System.out.println(month.getLast());
		System.out.println(month.get(3));
		month.removeFirst();
		System.out.println(month);
		month.removeLast();
		System.out.println(month);
		month.removeFirstOccurrence("May");
		System.out.println(month);
		month.removeLastOccurrence("May");
		System.out.println(month);
		System.out.println(month.pollLast());
		System.out.println(month.poll());
		System.out.println(month);
		

	}

}
