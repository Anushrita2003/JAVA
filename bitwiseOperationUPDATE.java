import java.util.*;
public class bitwiseOperationUPDATE {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int oper=sc.nextInt(); // 0 to clear and 1 to set
        int a=5;
        int pos=1;
        int bitwiseMask=1<<pos;

        if(oper==0){
            System.out.println(~(bitwiseMask) & a);
        }
        else{
            System.out.println(bitwiseMask | a);
        }
        sc.close();
    }
}
