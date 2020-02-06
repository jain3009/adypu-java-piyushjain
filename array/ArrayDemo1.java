package array;

public class ArrayDemo1 {
	void onedArray()
	{
		int array[]= {1,2,3,4,5};
		int array1[]=new int [5];
		 
		array[0]=1;
		array[1]=2;
		array[2]=3;
		array[3]=4;
		array[4]=5;
		
		for(int i=0;i<array.length;i++)
		{
			System.out.println(array[i]);
		}
			
	} 
	
	void twodArray()
	{
		int array[][]= {{1,2,3},{4,5,6},{7,8,9}};
		for(int i=0;i<array.length;i++)
			
		{
			for (int j=array.length-1;j>=0;j--)
			{
				System.out.println(""+array[i][j]);
			}
			System.out.println();
		}
	}
	   public static void main (String[]args)
	   {
		   ArrayDemo1 demo=new ArrayDemo1();
		   demo.onedArray();
		   demo.twodArray();
	   }
	   
}
	   
	   
	   
	   
	
	
	
	
	
	
	
	

	


