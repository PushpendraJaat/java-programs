class Nestingtest
{
	
	int add()
	{
		int a=10, b=20;
		int z= a+b;
		return z;
	}
	void disp()
	{
		int x= add();
		
		System.out.println("Addition="+x);
	}
}
public class Nestingofmethods
{
   public static void main(String args[])
     	{
		    Nestingtest obj=new Nestingtest();
		    obj.disp();
	    }
}