package Assignment_String;

public class Q22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuffer sb=new StringBuffer("welcome");
		
		sb.append("to add");
		System.out.println(sb);// add a char in last
		
		sb.delete(5, 8);
		System.out.println(sb);// delete the char from this position
		
		sb.insert(7, 'a');// insert the char from this positin
		System.out.println(sb);
		
		sb.setCharAt(2,'$');// add char from the position
		System.out.println(sb);
		
		sb.reverse();// reverse string
		System.out.println(sb);
		
		int a=sb.indexOf("o");// index value of given char
		System.out.println(a);
		
	}

}
