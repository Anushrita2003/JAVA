public class STRING_1 {
    public static void main(String args[]){
        StringBuilder sb = new StringBuilder("Tony");
        System.out.println(sb);


        sb.insert(2,'n');
        System.out.println(sb);


        // System.out.println(sb.CharAt(0));
        // sb.setChatAt(0,'P');
        // System.out.println(sb);


        sb.delete(2,3);
        System.out.println(sb);

        sb.append("Kumar");
        sb.append("u");
        sb.append("m");
        sb.append("a");
        sb.append("r");
        System.out.println(sb.length());
    }
}
