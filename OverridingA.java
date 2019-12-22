class C
{
  public void example(int x)
  {
   System.out.println("class A");
  }
}
class D extends C
{
 public void example(int x)
  { 
  System.out.println("class B");
  }
}
public class OverridingA
{
 public static void main (String []args)
 {
 D obj=new D();
 obj.example(3);
 }
}