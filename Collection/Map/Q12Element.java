package assignment_Map;

import java.util.TreeMap;

public class Q12Element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap m=new TreeMap();

		m.put(1, "SSS");
		m.put(2, "PPP");
		m.put(3, "QQQ");
		m.put(4, "MMM");
		m.put(5, "NNN");
		
		System.out.println(m.firstKey());
		System.out.println(m.lastKey());

	}

}
