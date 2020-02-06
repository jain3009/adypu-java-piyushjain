package inheritance;

public class multilevelinheritance extends singleinheritance{
	 int mul(int a,int b){
	        return (a*b);
} public static void main(String[] args) {
	multilevelinheritance inheritance=new multilevelinheritance ();
    System.out.println("Addition : "+inheritance.add(20,10));
    System.out.println("Sub : "+inheritance.sub(20,10));
    System.out.println("mul : "+inheritance.mul(20,10));    }
}
