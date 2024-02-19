package oldone;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PalindromePermutation {
    public static void main(String[] args) {
        PalindromePermutation palindromePermutation = new PalindromePermutation();
        String input = "tact coa";
        System.out.printf("Is Palindrome oldone.Permutation? %s, \n", palindromePermutation.permutationPalindrome(input));
    }
    public boolean permutationPalindrome(String palindrome){
        Permutation permutationClass = new Permutation();
        List<String> permutations = new ArrayList<>();
        permutationClass.getPermutation(palindrome, 0, palindrome.length(), permutations);

        System.out.printf("All Permutations: %s \n", Arrays.toString(permutations.toArray()));

        return permutations.stream().filter(e->isEqualReversed(e)).count()> 1;
    }

    public boolean isEqualReversed(String param){
        param = param.replace(" ", "");
        return param.equalsIgnoreCase(new StringBuilder(param).reverse().toString());
    }
}
