class A
{
  public void example(int x , int y)
  {
   System.out.println("class A");
  }
}
class B extends A
{
 public void example(int x , int y , int z)
  { 
  System.out.println("class B");
  }
}
public class OverloadB
{
 public static void main (String []args)
 {
 B obj=new B();
 obj.example(3,4);
 obj.example(2,2,9);
 }
}
