import java.util.Scanner;
class DECtoBIN
{
public static void main(String[] args)
 {
   Scanner sc=new Scanner(System.in);
   System.out.print("Enter any decimal number:");
   int n=sc.nextInt();
   int temp=n;
   int rem=0;
   String s="";
   while(n>0)
  {
   rem=n%2;
   s=rem+s;
   n=n/2;
   }
   System.out.println("decimal of "+temp+" convert into binary "+s);
 }
}