public class operators {
    public static void main(String[] args)
    {
        var a=20;
        var b=10;
        System.out.println("ARITHMATIC OPERATORS :\n");
        System.out.println("\taddition:"+(a+b));
        System.out.println("\tsubstraction:"+(a-b));
        System.out.println("\tmultiplication:"+(a*b));
        System.out.println("\tdivision:"+(a/b));
        System.out.println("\tmodules:"+(a%b));
        System.out.println("");

        System.out.println("RELATIONAL OPERATORS :\n");
        System.out.println("\tgreater than:"+(a>b));
        System.out.println("\tlesser than :"+(a<b));
        System.out.println("\tgrater than or equal to:"+(a>=b));
        System.out.println("\tless than or equal to:"+(a<=b));
        System.out.println("\tnot equal to:"+(a!=b));
        System.out.println("\tequalto equalto:"+(a==b)+"\n");

        System.out.println("LOGICAL OPERATORS :\n");
        System.out.println("\tand:"+(true&&false));
        // System.out.println("\t or:"+(true||true));
        System.out.println("\tnot:"+(!true)+"\n");

        System.out.println("UNARY OPERATORS");
        var num1=10;
        var num2=0;
        System.out.println("increment:"+(++num2));
        System.out.println("increment:"+(++num1));

    
        
    }

}
