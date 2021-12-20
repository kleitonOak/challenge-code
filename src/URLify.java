/**
 * URLify a given string (Replace spaces is %20)
 *
 */
public class URLify {
    /**
     * Write a method to replace all the spaces in a string with ‘%20’. You may assume that the string has sufficient space at the end to hold the additional characters and that you are given the “true” length of the string.
     * @param args
     * Examples:
     * Input: "Mr John Smith", 13
     * Output: Mr%20John%20Smith
     *
     * Input: "Mr John Smith   ", 13
     * Output: Mr%20John%20Smith
     */
    public static void main(String[] args) {
        UrlData[] urls = new UrlData[]{new UrlData("Mr John Smith", 13), new UrlData("MK John Smith   ", 13)};

        for(UrlData data: urls){
            System.out.println("Urlify Result: "+ urlfyMethod(data));
        }
    }

    private static String urlfyMethod(UrlData urlData){
        StringBuilder output = new StringBuilder();
        for(int i = 0; i<urlData.realSize; i++){
            char charAt = urlData.url.charAt(i);
            if(charAt == ' '){
                output.append("%20");
            }else{
                output.append(charAt);
            }
        }

        return output.toString();
    }


    public static class UrlData{
        public UrlData(String url, Integer realSize){
            this.url = url;
            this.realSize = realSize;
        }
        private String url;
        private Integer realSize;
    }
}