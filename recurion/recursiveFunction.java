package recurion;

public class recursiveFunction {
	static int count=0;
	void showArray() {
		int array []= {1,2,3,4,5,6};
		
	System.out.println(array[count]);
	if(count<array.length-1) {
		count++;
		showArray();
	}
	
	}
     public static void main(String[]args){
    	 
	recursiveFunction function=new recursiveFunction();
	
	function.showArray();
	

	}
}
