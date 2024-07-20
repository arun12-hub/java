import java.util.Scanner;
public class cgpausingswitch {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter your total mark:");
        int marks=sc.nextInt();
        System.out.print("enter your gender:");
        char gender=sc.next().charAt(0);
        int cgpa=marks/10;
        if (gender=='m'){
            switch(cgpa){
                case 10,9,8:
                System.out.println("very good");
                break;
                case 7:
                System.out.println(" good");
                break;
                case 6:
                System.out.println(" can do better");
                break;
                case 5:
                System.out.println("bad");
                break;
                default:
                System.out.println("get lost idiot");
            }
        }
        else if (gender=='f'){
            switch(cgpa){
                case 10:
                System.out.println("excellent");
                break;
                case 9,8,7:
                System.out.println("  very good");
                break;
                case 6:
                System.out.println("good");
                break;
                case 5:
                System.out.println("can do better");
                break;
                default:
                System.out.println("okay fine,youb can still improve");
            }
        }
        else {
            System.out.println("invalid input");
        }
        // switch (cgpa) {
        //         case 10:
        //              if(gender=='m')
        //              System.out.println("very good");

        //              else if(gender=='f')
        //              System.out.println("excellent");
        //              break;
        //         case 9,8,7:
        //              if(cgpa==7){
        //              if(gender=='m'){
        //              System.out.println("good");
        //         }
        //     }
        //              else if(gender=='m'){
        //              System.out.println("very good");
        //         }
        //             else if(gender=='f')
        //             System.out.println("very good");
        //             break;
        //         case 6:
        //             if(gender=='m')
        //             System.out.println("can do better");

        //             else if(gender=='f')
        //             System.out.println("good");
        //             break;
        //         case 5:
        //            if(gender=='m')
        //            System.out.println("bad");

        //            else if(gender=='f')
        //            System.out.println("can do better");
        //            break;
             
        //     default:

        //         if(gender=='m')
        //         System.out.println("get lost idiot");

        //         else if(gender=='f')
        //         System.out.println("okay fine,youb can still improve");
        //         break;
        // }

    
    
}
    }