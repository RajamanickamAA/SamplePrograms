package arrayList.learn.automation.online;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> name = new ArrayList<String>();

		name.add("Banana");
		name.add("Orange");
		name.add("Apple");
		name.add("Pineapple");
		name.add("Pineapple");
		System.out.println(name);
		System.out.println(name.get(3));
		System.out.println(name.indexOf("Pineapple"));
		System.out.println(name.lastIndexOf("Pineapple"));

		List<String> anotherlist = new ArrayList<String>();
		anotherlist.addAll(name);
		System.out.println(anotherlist);
		anotherlist.remove(2);
		System.out.println(anotherlist);
		anotherlist.remove("Pineapple");
		System.out.println(anotherlist);
		anotherlist.set(1, "Rajamanickam");
		System.out.println(anotherlist);
		anotherlist.clear();
		System.out.println(anotherlist);
		System.out.println(anotherlist.isEmpty());
		
		Iterator<String> value = name.iterator();
		while(value.hasNext()) {
			System.out.println(value.next());
		}


		ListIterator<String> list = name.listIterator(); 
		while(list.hasNext()) {
			System.out.println(list.next()); }


		while(list.hasPrevious()) {
			System.out.println(list.previous());
		}


	}

}
