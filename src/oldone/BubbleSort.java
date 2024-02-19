package oldone;

import java.math.BigDecimal;
import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int[] vector = new int[]{5,1,4,20, 3,5,0,3};
        System.out.format("Vector Before Bubble Sort, %s \ni", Arrays.toString(vector));
        bubbleSort(vector, vector.length);
        System.out.format("Vector After Bubble Sort, %s", Arrays.toString(vector));

        BigDecimal bigDecimal = new BigDecimal("2500.00");
        BigDecimal bigDecimal2 = new BigDecimal("2500.00");
        BigDecimal bigDecimal3 = bigDecimal.subtract(bigDecimal2);
        System.out.println(bigDecimal3.doubleValue());

    }


    private static void bubbleSort(int[] vector, int size){
        if(size > 0){
            for(int i=0; i<size-1; i++){
                if(vector[i] > vector[i+1]){
                    int temp = vector[i];
                    vector[i] = vector[i+1];
                    vector[i+1] = temp;
                }
            }
            System.out.format("Size: %d - Vector After Bubble Sort, %s \n",size, Arrays.toString(vector));
            bubbleSort(vector, size-1);
        }
    }
}
