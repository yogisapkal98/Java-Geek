package assignment_Map;

import java.util.TreeMap;

public class Q11TM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap m=new TreeMap();

		m.put(1, "SSS");
		m.put(2, "PPP");
		m.put(3, "QQQ");
		m.put(4, "MMM");
		m.put(5, "NNN");
		
		System.out.println(m.firstKey());
		System.out.println(m.firstEntry());
		System.out.println(m.lastKey());
		System.out.println(m.lastEntry());

	}

}
