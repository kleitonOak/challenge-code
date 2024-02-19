package newone;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FindUniqueNumberArray {

    public static Integer bruteForce(Integer[] v){
        for(int i=0; i<v.length - 1; i++){
            Boolean isFounded = Boolean.FALSE;
            for(int j=i+1; j< v.length; j++){
                if(v[i] == v[j]){
                    isFounded = Boolean.TRUE;
                    break;
                }
            }

            if(!isFounded){
                return v[i];
            }
        }
        return null;
    }

    public static Integer findWithSort(Integer[] v){
        List<Integer> sorted = Arrays.stream(v).sorted().collect(Collectors.toList());

        for(int i= 0; i<sorted.size(); i+=2){
            if(Integer.valueOf(i)==sorted.size()-1 || sorted.get(i) != sorted.get(i+1)){
                return sorted.get(i);
            }
        }

        return null;
    }

    public static Integer findWithHash(Integer[] v){
        Map<Integer, Integer> values = new HashMap<>();
        for(int i = 0; i<v.length; i++){
            putValueKey(values, v[i]);
        }

        for(Map.Entry<Integer, Integer> item: values.entrySet()){
            if(item.getValue() == 1 ){
                return item.getKey();
            }
        }

        return null;
    }

    private static void putValueKey(Map<Integer, Integer> values, Integer key) {
        if(values.containsKey(key)){
            Integer element = values.get(key);
            element++;
            values.put(key, element);
        }else{
            values.put(key, 1);
        }
    }

    public static Integer findSingleNumber(Integer[] nums) {
        int uniqueNumber = 0;
        for (int num : nums) {
            uniqueNumber ^= num;
        }
        return uniqueNumber;
    }

    public static Integer findUniqueNumber(Integer[] v){
        //return bruteForce(v);
        //return findWithSort(v);
        //return findWithHash(v);
        return findSingleNumber(v);
    }

    public static void main(String[] args) {
        Integer[] v = {10,8,3,7,3,9,9,2,7,10,2};
        System.out.printf("which? %d", findUniqueNumber(v));
    }
}
