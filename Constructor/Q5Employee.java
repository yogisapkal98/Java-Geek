package assignment6Constructor;

public class Q5Employee {
	 
	int id;
	String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public static void main(String[] args) {
		Q5Employee a=new Q5Employee();
		a.setId(10);
		a.setName("Yogesh");
		System.out.println(a.getId());
		System.out.println(a.getName());
	}

}
