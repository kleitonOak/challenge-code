import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
/** 
*  This is a demo task. Write a function:
* class Solution { public int solution(int[] A); }
* that, given an array A of N integers, returns the smallest positive integer (greater than 0) that does not occur in A.
* For example, given A = [1, 3, 6, 4, 1, 2], the function should return 5.
* Given A = [1, 2, 3], the function should return 4.
* Given A = [−1, −3], the function should return 1.
* Write an efficient algorithm for the following assumptions:
* N is an integer within the range [1..100,000];
* each element of array A is an integer within the range [−1,000,000..1,000,000].
**/
public class MissinInteger{

    public static void main(String[] args) {
		System.out.println(solution(new Integer[]{-1,-3}));
	}

	private static int solution(Integer[] args) {
		Map<Integer, Integer> treatedArray = Arrays.stream(args).filter(e->e > 0).distinct().collect(Collectors.toMap(Function.identity(), e -> e));
		int index = 1;
		while (treatedArray.get(index) != null){
			index++;
		}

        return index;
	}
}