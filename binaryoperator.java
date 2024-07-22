class binaryoperator{
    public static void main(String[] args)
    {
        var a=10;
        var b=0;
        b=a++;
        System.out.println("A:"+a);
        System.out.println("B:"+b+"\n" );

        var c=10;
        var d=0;
        d=++c + c++ + c++ + --c +c--;
        System.out.println("c:"+c);
        System.out.println("D:"+d+"\n");
        
        var e=10;
        var f=0;
        f=--e + e-- +  ++e;
        System.out.println("E:"+e);
        System.out.println("F:"+f);
        

    }
}