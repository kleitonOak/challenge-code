package oldone;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Determine if a string has all Unique Characters
 */
public class UniqueCharacters {
    public static void main(String[] args) {
        String input = "abcd10jk";

        if (hasUniqueCharacters(input))
            System.out.println("The String " + input + " has all unique characters");
        else
            System.out.println("The String " + input + " has duplicate characters");
    }


    /**
     * Determine if a string has all Unique Characters
     * @param param - String to be checked
     * @return TRUE or FALSE
     */
    private static Boolean hasUniqueCharacters(String param){
        //return hasUniqueCharactersUsingBruteForce(param);
        //return hasUniqueCharactersUsingSort(param);
        //return hasUniqueCharactersASCIIcharset(param);
        return hasUniqueCharactersWithSet(param);
    }
    /**
     * Time Complexity: O(n2)
     * Determine if a string has all Unique Characters
     * @param param - String to be checked
     * @return TRUE or FALSE
     */
    private static Boolean hasUniqueCharactersUsingBruteForce(String param){
        for(int i = 0; i< param.length(); i++){
            for(int j = i+1; j<param.length(); j++){
                if(param.charAt(i) == param.charAt(j)){
                    return Boolean.FALSE;
                }
            }
        }
        return Boolean.TRUE;
    }

    /**
     * Time Complexity: O(n log n)
     * Determine if a string has all Unique Characters
     * @param param - String to be checked
     * @return TRUE or FALSE
     */
    private static Boolean hasUniqueCharactersUsingSort(String param){
        char[] chArray = param.toCharArray();

        for(int i=0; i<param.length() -1; i++){
            if(param.charAt(i) != param.charAt(i+1)){
                continue;
            }else{
                return Boolean.FALSE;
            }

        }
        return Boolean.TRUE;
    }

    /**
     * Time Complexity: O(n)
     * Determine if a string has all Unique Characters
     * @param param - String to be checked
     * @return TRUE or FALSE
     */
    private static Boolean hasUniqueCharactersASCIIcharset(String param){
        int MAX_CHAR = 256;
        if (param.length() > MAX_CHAR)
            return false;

        boolean[] chars = new boolean[MAX_CHAR];
        Arrays.fill(chars, false);

        for(int i=0; i<param.length(); i++){
            int index = (int)param.charAt(i);
            if (chars[index] == true)
                return Boolean.FALSE;
            chars[index] = true;

        }
        return Boolean.TRUE;
    }

    /**
     * Time Complexity: O(n)
     * Determine if a string has all Unique Characters
     * @param param - String to be checked
     * @return TRUE or FALSE
     */
    private static Boolean hasUniqueCharactersWithSet(String param){
        Set<Character> sets = new HashSet();
        char[] chars = param.toCharArray();
        for(char letter: chars){
            sets.add(letter);
        }

        if(sets.size() != param.length()){
            return Boolean.FALSE;
        }
        return Boolean.TRUE;
    }


}
