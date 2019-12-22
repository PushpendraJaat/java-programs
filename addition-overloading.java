class Adder2
{
 static int add(int a, int b){return a+b;}
 static int add(int a, int b, int c){return a+b+c;}
}
class Testoverloading
{
 public static void main(String[] args)
{
  System.out.println(Adder2.add(11,22));
  System.out.println(Adder2.add(11,22,33));
}
}
