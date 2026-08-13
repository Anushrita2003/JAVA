import java.util.*;

public class SaskenMedium {

    public static int retNoOpernation(int input1,int input2[],int input3){
        int Xor=0;
        for(int i=0;i<input1;i++){
            Xor=Xor^input2[i];
        }
        if(Xor==input3){
            return 0;
        }
        else{
            int diff=Xor^input3;
            return Integer.bitCount(diff);
        }
    }    
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        int input1=sc.nextInt();

        int[] input2=new int[input1];
        for(int i=0;i<input1;i++){
            input2[i]=sc.nextInt();
        }

        int input3=sc.nextInt();

        int r=retNoOpernation(input1,input2,input3);
        System.out.println(r);
        sc.close();
    }
}
