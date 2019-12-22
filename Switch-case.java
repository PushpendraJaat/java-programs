class Switchnew
{
 public static void main(String []args)
 {
  char grade = 'c';
  switch(grade){
   case 'a':System.out.println("Exellent");
   break;
   case 'b':System.out.println("Very Good");
   break;
   case 'c':System.out.println("Well done");
   break;
   case 'd':System.out.println("Need Improvement");
   break;
   default : System.out.println("Invalid Grade");
   break;
  }
  System.out.println("Your grade is"+" "+grade);
}
}
