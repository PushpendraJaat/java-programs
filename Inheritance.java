class G
{
    public double a = 9.55 ;
	public double b = 77.7 ;
}
class F extends G
{
 public void multi(){
	 double product = a*b;
	 System.out.println("Product =" + product);
 }
	
}
class Inherit
{
	public static void main(String [] args)
	{
		F obj=new F4();
		obj.multi();
		
	}
	
}
