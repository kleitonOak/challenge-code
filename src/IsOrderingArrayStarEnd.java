public class IsOrderingArrayStarEnd {

    boolean solution(int[] a) {
        int [] newA = new int [a.length];
        int great = a[0];
        int start = 0;
        int end = a.length;
        for(int i=0; i<a.length; i++){

            if((i+1)%2 == 0){
                newA[i] = a[--end];
            }else{
                newA[i] = a[start++];
            }

            if(newA[i] >= great){
                great = newA[i];
            }else{
                return false;
            }
        }

        return true;

    }

    public static void main(String[] args) {
        IsOrderingArrayStarEnd solution = new IsOrderingArrayStarEnd();
        System.out.print(solution.solution(new int[]  {1, 3, 5, 6, 4, 2}));
    }
}
