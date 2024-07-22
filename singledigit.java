public class singledigit {
    public static int digit(int n){
        int sum=0;
        while(n>0){
            sum+=n%10;
            n/=10;
        }
        return sum;
    }
    public static void main(String[] args){
       int  n=111;
        int sum=n;
        while(sum>=10){
            sum=digit(sum);
        }
        System.out.println(sum);
    }
    
}
