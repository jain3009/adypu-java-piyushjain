package keywords;

public class Thiskey1 {
	int id;

	String name;
	
	Thiskey1(){
		this(1,"abcd");
	
		System.out.println("inside defult construtor");
	}
	Thiskey1(int id, String name){
		System.out.println("construtoe body id:"+id+"\nName:"+name);	
		this.id=id;
		this.name=name;
		
	}
	private void main (string[]args) {
		System.out.println("inside getData");
	}
	

	public static void main(String[]args)
	{
	Thiskey1 key=new Thiskey1(1,"abcd");
    key.showData();

}
	private void showData() {
		// TODO Auto-generated method stub
		
	}

}

