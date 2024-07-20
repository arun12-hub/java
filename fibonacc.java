import java.util.Scanner;
public class fibonacc {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number to print fibonacci:");
        int n=sc.nextInt();
        int a=-1;
        int b=1;
        int c=0;
        while(c<=n){
            c=a+b;
            a=b;
            b=c;
            if(c<=n)
            System.out.println(c);
            
        }
    }
    
}
