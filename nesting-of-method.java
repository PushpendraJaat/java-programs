import java.until.scanner;
class nesting_method 
{
  int perimeter(int l, int b);
  return pr;
}
int area(int l, int b)
{
   int pr=perimeter(l, b);
   System.out.println("perimeter:"+pr);
   int ar=6*l*b;
   return ar;
}
int volume(int l; int b; int h)
{
   int ar=area(l, b);
   System.out.println("area:"+ar);
   int vol;
   vol=1*b*h;
   return vol;
}
public static void main(String[] args)
{
   Scanner s=new Scanner(System.in);
   Stytem.out.print("enter length of cuboid:");
   int l= s.nextInt();
   System.out.print("Enter breadth of cuboid:");
   int b = s.nextInt();
   System.out.print("Enter height ofcuboid:");
   int h = s.nextInt();
   Nesting_Methods obj = new Nesting_Methods();
   int vol = obj.volume(l, b, h);
   System.out.println("Volume:"+vol);
}
}

   
