import java.util.*;

public class XORwithinRange {
    public static int XOR(int n){
        if(n%4==1){
            return 1;
        }
           else if(n%4==2){
                return n+1;
           }
                else if(n%4==3){
                    return 0;
                }
                else{
                    return n;
                }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int L=sc.nextInt();//Lower Range
        int U=sc.nextInt();//Upper Range

        int XorRange=XOR(L-1)^XOR(U);
        System.out.println(XorRange);
        sc.close();
    }
}
