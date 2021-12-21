/**
 * Compression using the counts of repeated characters. If the compressed string would not become smaller than original string,
 * the method must return the original string.
 * Example:
 * aabcccccaaa -> a2b1c5a3
 */
public class CompressionString {
    public static void main(String[] args) {
        String[] originals = new String[]{"aabcccccaaa", "wqwqwqAAAAvvvvvvvcccccc", "ooooosssssaaaaappplllllccccc"};
        for(String original: originals) {
            System.out.printf("Original: %s -> Compression: %s \n", original, compress(original));
        }
    }

    public static String compress(String original){
        return compressMethod(original);
    }

    public static String compressMethod(String original){
        int lastElementCount = 0;
        char charAt = original.charAt(0);
        StringBuilder compressedString = new StringBuilder();
        for(int i = 0; i<original.length() && original.length() > compressedString.length() ; i++){
            if(charAt == original.charAt(i)){
                lastElementCount++;
            }else{
                compressedString.append(charAt).append(lastElementCount);
                charAt = original.charAt(i);
                lastElementCount=1;
            }
        }
        compressedString.append(charAt).append(lastElementCount);

        return original.length() > compressedString.length()?compressedString.toString(): original;
    }
}
