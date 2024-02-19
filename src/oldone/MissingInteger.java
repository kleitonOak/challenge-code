package oldone;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
/** 
*  This is a demo task. Write a function:
* class Solution { public int solution(int[] goout.A); }
* that, given an array goout.A of N integers, returns the smallest positive integer (greater than 0) that does not occur in goout.A.
* For example, given goout.A = [1, 3, 6, 4, 1, 2], the function should return 5.
* Given goout.A = [1, 2, 3], the function should return 4.
* Given goout.A = [−1, −3], the function should return 1.
* Write an efficient algorithm for the following assumptions:
* N is an integer within the range [1..100,000];
* each element of array goout.A is an integer within the range [−1,000,000..1,000,000].
**/
public class MissingInteger{

    public static void main(String[] args) {
		System.out.println(solution(new int[]{-1,-3}));
	}

	private static int solution(int[] args) {
		Map<Integer, Integer> treatedArray = Arrays.stream(args).boxed().filter(e->e > 0).distinct().collect(Collectors.toMap(e->e, e -> e));
		int index = 1;
		while (treatedArray.get(index) != null){
			index++;
		}

        return index;
	}
}