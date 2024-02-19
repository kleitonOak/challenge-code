package newone;

public class Palindrome {

    public static boolean isPalindromeOne(String input){
        StringBuilder builder = new StringBuilder(input);
        return builder.reverse().toString().equalsIgnoreCase(input);
    }

    public static boolean isPalindromeTwo(String input){
        input = input.toLowerCase();
        int left = 0;
        int right = input.length() - 1;
        while(left < right){
            if(input.charAt(left) != input.charAt(right)){
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
    public static boolean isPalindrome(String input){
        //return  isPalindromeOne(input);
        return isPalindromeTwo(input);
    }
    public static void main(String[] args){
            String word = "Radar";
            System.out.printf("Is the word %s Palindrome? %s", word, isPalindrome(word));
    }
}
