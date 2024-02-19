package newone;

public class SequenceArray {
    public static Boolean isSequence(Integer[] v, Integer[] s){
        int vPointer = 0;
        int sPointer = 0;

        while(vPointer < v.length && sPointer < s.length){
            if(v[vPointer] == s[sPointer] ){
                sPointer++;
            }
            vPointer++;
        }

        return sPointer == s.length;
    }

    public static void main(String[] args) {
        Integer[] v = {1,2,-3,10,7,12,17,30};
        Integer[] s = {-3,2, 30};
        System.out.println("isSubArray: "+ isSequence(v,s));
    }
}
