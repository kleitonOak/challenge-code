package newone;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class IsOrderingArray {

    public static void main(String[] args) {
        int[] v = {1,2,6,7,3,9,4,8,5, 11};

        System.out.printf("Is the array: %s ordered? %s", Arrays.toString(v), isOrderingArrayOk(v));
    }

    private static Boolean isOrderingArrayOk(int[] v) {
        //return isOrderingArrayOne(v);
        return isOrderingArrayTwo(v);
    }

    private static Boolean isOrderingArrayTwo(int[] v) {
        Map<Integer, Integer> vInMap  = Arrays.stream(v).boxed().collect(Collectors.toMap(e->e, e->e));
        for(int i= 1; i<=vInMap.size(); i++){

            if(!vInMap.containsKey(i)){
                return false;
            }
        }

        return true;
    }

    public static Boolean isOrderingArrayOne(int[]v ){
        var v1 = Arrays.stream(v).boxed().sorted().toArray(size->new Integer[size]);
        int index = 1;
        for(Integer item: v1) {
            if (item != index) {
                return false;
            }
            index++;
        }
        return true;
    }
}
