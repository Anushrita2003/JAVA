import java.util.*;
class perfect_Num {
    public boolean checkPerfectNumber(int num) {
        int sum=0;
        for(int i=1;i*i<num;i++){
            if(num%i==0) {
                sum=sum+i;
                System.out.println(sum);
            }
            if(i != (num/i) && num%(num/i)==0){
                
                 sum=sum+(num/i);
                 System.out.println(sum);
            }
        }
        if(num==(sum-num)) return true;
        else if(sum==1) return false;

        return false;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();

        perfect_Num obj=new perfect_Num();
        boolean isperfect=obj.checkPerfectNumber(num);
        System.out.println(isperfect);
        sc.close();
    }
}