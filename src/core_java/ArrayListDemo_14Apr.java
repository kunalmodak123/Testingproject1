package core_java;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo_14Apr {

	public static void main(String[] args) {
		
		ArrayList data = new ArrayList();
		//start with index 0
		data.add("hello");
		data.add(1234);
		data.add(true);
		data.add(3.147);
		data.add(1234);
		data.add(null);
		data.add(null);
		System.out.println(data);
		
		data.add(5,"kunal");
		System.out.println(data);
		
		data.remove(null);
		System.out.println(data);
		
//		data.remove(null);
//		System.out.println(data);
		
		System.out.println(data.get(2));
		
		System.out.println();
		
		Iterator it = data.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		for (Object da : data) 
		{
			System.out.println(da);
		}
		
		data.clear();
		System.out.println(data);
		
		
	}

}
