import java.util.*;

public class SaskenEasy {
    public static int surprisingNumber(int n){
        int sum=0;
        for(int i=7;i<=n;i=i*2+1){
            sum=sum+i;
        }
        return sum;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(surprisingNumber(n));
        sc.close();
    }
}
