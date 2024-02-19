package newone;

import java.util.Arrays;

public class KadanesAlgorithm {

    private static Integer kadanesWay(Integer[] v){
        int currentSum = 0;
        int maxValue = v[0];
        for(Integer n: v){
            currentSum = Math.max(currentSum, 0);
            currentSum += n;
            maxValue = Math.max(currentSum, maxValue);
        }

        return maxValue;
    }

    // O(nˆ2)
    private static Integer bruteForce(Integer[] v) {
        int max = v[0];
         for(int i=0; i<v.length; i++){
             int currentSum = 0;
             for(int j=i; j<v.length; j++){
                currentSum += v[j];
                max = Math.max(currentSum, max);
             }
         }

         return max;
    }
    public static Integer nonEmptySubArrayWithLargestValueSum(Integer[] v){
        //return bruteForce(v);
        return kadanesWay(v);
    }

    public static void main(String[] args) {
        Integer[] v = {4,-1,2,-7, 3,4};

        System.out.printf("Largest Sum from Array %s is %d", Arrays.toString(v), nonEmptySubArrayWithLargestValueSum(v));
    }
}
