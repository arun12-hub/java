public class nestedwhile {
    public static void main(String[] args){
        int i=1;
        while(i<=3){
            System.out.println();
            int j=1;
            while(j<=3){
                System.out.println("i:"+i+", j:"+j);
                j++;
            }
            i++;
        }
    }
    
}
