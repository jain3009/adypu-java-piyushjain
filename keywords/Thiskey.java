package keywords;

public class Thiskey {

	int id;

	string name;
	
	private void showData() {
		System.out.println("id:"+id+"\nName:"+name);
	}

Thiskey(int id,String string){
	
	System.out.println("id:"+id+"\nName"+string);
	
}

public static void main (string[]args) {

	Thiskey key=new Thiskey(1,"abcd");
	
	key.showData();
}
}





