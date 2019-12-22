import java.util.*;
public class Arrayy
{
	
	public static void main(String []args)
	
	{
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[5];                                                                                                                   
		System.out.println("ENTER 5 values for array entry");
		int i;
		int y;
		
		
		for(i=0;i<5;i++){
		
		arr[i]=sc.nextInt();}
		
		for(y=0;y<5;y++){
		
		System.out.println("arr["+y+"]="+arr[i]);}
		
			
	}
}
