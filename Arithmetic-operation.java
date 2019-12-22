import java.util.*;
class Arithmetic
{
	public static void main(String args[])
	{
		Scanner ob=new Scanner(System.in);
       System.out.println("Enter a number");
	int a=ob.nextInt();
	System.out.println("Enter sexond number");
	int b=ob.nextInt();
	int c=a*b;
	int d=a+b;
	int f=a/b;
	int e=a-b;
	System.out.println("Addition:"+c+'\n' +"Subtraction:"+e+'\n'+"Mutiplication:"+c+'\n'+"Divition:"+f);
	}
}
