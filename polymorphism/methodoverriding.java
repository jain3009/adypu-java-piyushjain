package polymorphism;

public class methodoverriding extends methodoverloding {
	
int a=200;

	    void add1(int a,int b){
	    	
	    }
	    public methodoverriding() {
	        super();
	        System.out.println("Inside Child class constructor");
	    }

	    void add(int a, int b){
	        System.out.println("Overriding Addition : "+(a+b));
	    }

	    void showData(){
	        super.add(10,20);
	        System.out.println(super.a);
	    }

	    public static void main(String[] args) {
	        methodoverriding overriding=new methodoverriding();
	        overriding.add1(10,20);
	        overriding.showData();
	    }

	}