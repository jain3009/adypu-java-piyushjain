package polymorphism;

public class methodoverloding {
	public static final char[] a = null;
	void add (int a,int b) {
		System.out.println("Addtion:"+(a+b));
		}
void add(int a,int b,int c)
{
	System.out.println("Addtion:"+(a+b+c));

}
public static void main(String[]args)
{
	methodoverloding m=new methodoverloding();
	m.add(5,5,5);
}
}
