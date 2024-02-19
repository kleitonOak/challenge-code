package oldone;

import java.util.Arrays;

public class ArrayMutation {
    public static int[] solution(int n, int[] a) {
        int [] b = new int[n];

        for(int i = 0; i<a.length; i++){

            int startLimit = i>0?a[i - 1]:0;
            int finalLimit = i<n-1?a[i + 1]:0;

            b[i] = startLimit + a[i] + finalLimit;
        }

        return b;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(5, new int[]{4, 0, 1, -2, 3})));
    }
}
