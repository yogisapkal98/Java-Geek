package assignment6Constructor;

public class Q3Bank {
	
	int amount=5000;
	

	public Q3Bank() {
		super();
		//System.out.println(amount);
	}



	public Q3Bank(int amount) {
		super();
		this.amount=this.amount+amount; 
		
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Q3Bank a=new Q3Bank();
		System.out.println(a.amount+"--Initial amt");
		
		Q3Bank a1=new Q3Bank(3000);
		System.out.println(a1.amount+"--After increment");
		

	}

}
