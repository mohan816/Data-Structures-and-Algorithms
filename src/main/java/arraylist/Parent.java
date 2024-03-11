package arraylist;

public class Parent {
	int a = 10, b = 20;
	
	public Parent() {
		System.out.println("Default Constructor");
	}
	
	public Parent(int a ,int b) {
		this();
		System.out.println("Paramet costrucr");
	}
	
	
	  public void getName(String s) { 
		  System.out.println("Parkavi");
	  }
	 
	
	public void getName(String s,String a) {
		this.getName("s");
		System.out.println("Parkavi");
	}
	
	public static void main(String[] args) {
		 new Parent(10, 20);
		//p.getName("a");
	}
	
	

}
