package assignment_Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Q10IterateHM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map m=new HashMap();

		m.put(1, "SSS");
		m.put(2, "PPP");
		m.put(3, "QQQ");
		m.put(4, "MMM");
		m.put(5, "NNN");
		
		Set s=m.entrySet();
		Iterator itr=s.iterator();
		
		while(itr.hasNext())
		{
			Object o=itr.next();
			//Q10IterateHM e=(Q10IterateHM)o;
			System.out.println(o);
		}
		

	}

}
