package keywords;

public class statickey {
	static int count=0;
	
	public static void showData() {
		System.out.println(count);
		
		System.out.println("inside static method");
	}
	
	public void getData() {
		
		System.out.println("inside non-static method ");
		
	}
static {
	System.out.println("inside static block");
	
}
public static void main (String[]args) {
	
	statickey s=new statickey();
	
	s.getData();
	showData();
}

}


