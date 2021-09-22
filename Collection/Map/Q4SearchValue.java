package assignment_Map;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Q4SearchValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map m=new TreeMap();

		m.put(1, "SSS");
		m.put(2, "PPP");
		m.put(3, "QQQ");
		m.put(4, "MMM");
		m.put(5, "NNN");
		
		Set s=m.entrySet();
		System.out.println(s);
		
		System.out.println(m.containsValue("QQQ"));

	}

}
