package Assignment_String;

public class Q21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		StringBuilder sb=new StringBuilder("computer");
		String sb2=new String("don ");
			
		sb.append("m");// add char in last
		System.out.println(sb);
		
		sb.setCharAt(7, 'A');//set char
		System.out.println(sb);
		
		sb.replace(0,8,sb2);//change to string
		System.out.println(sb2);
		
		sb.setCharAt(0, 'a');
		System.out.println(sb);
	}
}
