package oldone;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 * There are three types of edits that can be performed on string: Insert a character, Remove a character, or Replace a character.
 * Given two strings, write a function to check if they are one edit (Or zero edits) away.
 * Example:
 * pale,  ple  -> true
 * pales, pale -> true
 * pale, bale  -> true
 * pale, bake  -> false
 */
public class OneWayString {
    public static void main(String[] args) {
        String[] firsts = new String[]{"pale", "pales", "pale", "pale", "heap"};
        String[] seconds = new String[]{"ple", "pale", "bale", "bake", "eap"};

        for(int i=0; i<firsts.length; i++){
            System.out.printf("%s and %s is result = %s \n", firsts[i], seconds[i], isOneWayEdit(firsts[i], seconds[i]));
        }
    }

    public static Boolean isOneWayEdit(String first, String second) {
        //return isOneWayEditUsingSets(first, second);
        return  isOneWayEditUsingStringBuffer(first, second);
    }

    public static Boolean isOneWayEditUsingStringBuffer(String first, String second) {
        if ((first.length() - second.length()) > 1) {
            return Boolean.FALSE;
        }

        Integer diff =  0;
        Boolean isOneEdit = Boolean.FALSE;
        int max = first.length()>second.length()?first.length():second.length();

        for(int i = 0; i<max; i++){
            if(checkString(first, second, i)){
                isOneEdit = Boolean.TRUE;
                break;
            }
        }

        return isOneEdit;

    }

    private static boolean checkString(String first, String second, int i) {
        boolean hasSameSize = first.length() == second.length();
        //REPLACE
        if(hasSameSize) {
            StringBuilder tempA = new StringBuilder(first);
            StringBuilder tempB = new StringBuilder(second);
            tempA.deleteCharAt(i);
            tempB.deleteCharAt(i);
            return Objects.equals(tempA.toString(), tempB.toString());
        }

        //INSERT OU REMOVE
        if(first.length() > second.length()){
            StringBuilder tempA = new StringBuilder(first);
            tempA.deleteCharAt(i);
            return Objects.equals(tempA.toString(), second);
        }else{
            StringBuilder tempB = new StringBuilder(second);
            tempB.deleteCharAt(i);
            return Objects.equals(tempB.toString(), first);
        }

    }

    public static Boolean isOneWayEditUsingSets(String first, String second) {
        if ((first.length() - second.length()) > 1) {
            return Boolean.FALSE;
        }

        char[] firstArray = first.toCharArray();
        char[] secondArray = second.toCharArray();
        Set<Character> setFirstElement = new HashSet<>();
        Set<Character> setSecondElement = new HashSet<>();
        for(char element: firstArray){
            setFirstElement.add(element);
        }

        for(char element: secondArray){
            setSecondElement.add(element);
        }

        setFirstElement.removeAll(setSecondElement);
        if(setFirstElement.size() > 1){
            return Boolean.FALSE;
        }

        return Boolean.TRUE;
    }

}
