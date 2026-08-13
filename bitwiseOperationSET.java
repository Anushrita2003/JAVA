public class bitwiseOperationSET {
    public static void main(String args[]){
    int n=5;
    int pos=1;

    int bitwiseMask=1<<pos;
    
    int b=bitwiseMask | n;
    System.out.println(b);
    }
}
