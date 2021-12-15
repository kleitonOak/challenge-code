import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Print all permutations of a string in Java
 * Given a string str, the task is to print all the permutations of str.
 * A permutation is an arrangement of all or part of a set of objects, with regard to the order of the arrangement.
 * For instance, the words ‘bat’ and ‘tab’ represents two distinct permutation (or arrangements) of a similar three letter word.
 */
public class Permutation {
    public static void main(String[] args) {
        String permutatioString = "ABC";
        List<String> permutations = new ArrayList<>();
        getPermutation(permutatioString, 0, permutatioString.length(), permutations);
        System.out.printf("Permutations: %s \n", Arrays.toString(permutations.toArray()));
    }

    private static void getPermutation(String param, Integer start, Integer end, List<String> permutations){
        if(start == end-1) {
            permutations.add(param);
        }else{
            for (int i = start; i < end; i++) {
                param = swap(param, start, i);
                getPermutation(param, start + 1, end, permutations);
                param = swap(param, start, i);
            }
        }
    }

    private static String swap(String param, Integer from, Integer to){
        StringBuilder stringToBeSwap = new StringBuilder(param);

        char charFrom = stringToBeSwap.charAt(from);
        char charTo = stringToBeSwap.charAt(to);

        stringToBeSwap.replace(from, from + 1, String.valueOf(charTo));
        stringToBeSwap.replace(to, to + 1, String.valueOf(charFrom));

        //System.out.println(stringToBeSwap.toString());
        return stringToBeSwap.toString();
    }
}
