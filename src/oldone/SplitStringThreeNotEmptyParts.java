package oldone;

import java.util.HashSet;
import java.util.Set;

public class SplitStringThreeNotEmptyParts {
    public int numWays(String s) {
        int ways = 0;
        for(int i=0; i<s.length(); i++){
            String a = s.substring(0, i+1);
            for(int j=i+1; j<s.length()-1; j++){
                String b = s.substring(j, j+1);
                String c = s.substring(j+1);
                ways+= isDifferentStringParts(a,b,c);
            }
        }

        return ways;
    }

    private int isDifferentStringParts(String a, String b, String c){
        Set<String> all = new HashSet<>();
        all.add(a);
        all.add(b);
        all.add(c);

        return all.size() == 3?1:0;
    }

    public static void main(String[] args) {
        SplitStringThreeNotEmptyParts solution = new SplitStringThreeNotEmptyParts();
        System.out.printf("Ways: %d",solution.numWays("10101"));
    }
}
