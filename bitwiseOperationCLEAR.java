public class bitwiseOperationCLEAR {
    public static void main(String args[]){
        int a=5;
        int pos=2;
        int bitMask=1<<pos;

        int notBitMask=~(bitMask);
        System.out.println(a & notBitMask);
    }
}
