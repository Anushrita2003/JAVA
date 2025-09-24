class solution{
public int trap(int[] arr) {
        int n = arr.length;
        // System.out.println(n);
        if (n == 0) return 0;

        int[] lmax = new int[n];
        int[] rmax = new int[n];

        lmax[0] = arr[0];
        for (int i = 1; i < n; i++) 
            lmax[i] = Math.max(lmax[i - 1], arr[i]);

        rmax[n - 1] = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) 
            rmax[i] = Math.max(rmax[i + 1], arr[i]);

        int trappedWater = 0;
        for (int i = 0; i < n; i++) {
            trappedWater += Math.min(lmax[i], rmax[i]) - arr[i];
        }

        return trappedWater;
    }
}

public class Raintrap {

    public static void main(String args[]){
    int[] arr={4,2,0,3,2,5};

    solution solution1 = new solution();
    int result=solution1.trap(arr);
    System.out.println(result);
}
}
