package assignment_Map;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Q2TreeMapInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map m=new TreeMap();

		m.put(1, 12);
		m.put(2, 13);
		m.put(3, 14);
		m.put(4, 15);
		m.put(5, 16);
		
		Set s=m.entrySet();
		System.out.println(s);

	}

}
