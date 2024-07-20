import java.util.*;
public class calculatorusingmethod{
    public static void add(){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the value of num1 for addition:");
        int num1=sc.nextInt();
        System.out.print("enter the value of num2 for addition:");
        int num2=sc.nextInt();
        System.out.println("ADDTION OF TWO NUMBERS:"+(num1+num2));

    }
    public static void sub(int a,int b){
        System.out.println("DIFFERENCE OF TWO NUMBERS:"+(a-b));
    }
    public static int mul(){
        Scanner sc=new Scanner(System.in);
        System.out.print("\nenter the value of num1 for multiplication:");
        int num1=sc.nextInt();
        System.out.print("enter the value of num2 for multiplication:");
        int num2=sc.nextInt();
        int product= num1*num2;
        return product;

    }
    public static double div(int num1,int num2){
        double q=num1/num2;
        return q;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        add();

        System.out.print("\nenter the value of num1 for substraction:");
        int num3=sc.nextInt();
        System.out.print("enter the value of num2 for substraction:");
        int num4=sc.nextInt();
        sub(num3,num4);

        int product=mul();
        System.out.println("MULTIPLICATION OF TWO NUMBERS:"+product);
        
        System.out.print("\nenter the value of num1 for division:");
        int num7=sc.nextInt();
        System.out.print("enter the value of num2 for division:");
        int num8=sc.nextInt();
        double quotient=div(num7,num8);
        System.out.println("THE QUOTIENT IS:"+quotient);


    }
}