public class Coins {

    public static void main(String[] args) {
        int[] vector= {1,0,1,1};
        int first = countFlip(vector,0);
        int second = countFlip(vector,1);
        System.out.print(first < second?first:second);
    }
    private static int countFlip(int[] vector, int expected){
        int count = 0;
        for(int i=0; i<vector.length; i++){
            if(vector[i] != expected){
                count++;
            }
            expected = elementSwap(expected);
        }

        return count;
    }

    private static int elementSwap(int element){
        return element == 0?1:0;
    }
}
