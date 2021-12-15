import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] vector = new int[]{5,1,4,20, 3,5,0,3};
        System.out.format("Vector Before Insertion Sort, %s \ni", Arrays.toString(vector));
        insertionSort(vector, vector.length);
        System.out.format("Vector After Insertion Sort, %s", Arrays.toString(vector));
    }

    private static void insertionSort(int [] vector, int size){
        for(int i=1; i<size; i++){
            int key = vector[i];
            int j = i-1;
            while (j >= 0  &&  vector[j] > key){
                vector[j+1] = vector[j];
                j--;
            }
            vector[j+1] = key;
        }
    }
}
