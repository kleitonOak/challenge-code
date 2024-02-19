package oldone;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
/*
Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.

goout.A subarray is a contiguous part of an array.



Example 1:

Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
Output: 6
Explanation: [4,-1,2,1] has the largest sum = 6.

Example 2:

Input: nums = [1]
Output: 1

Example 3:

Input: nums = [5,4,-1,7,8]
Output: 23



Constraints:

    1 <= nums.length <= 105
    -104 <= nums[i] <= 104

*/
public class Problem {
    public static void main(String[] args) {
        Integer[] input = new Integer[]{-2,1,-3,4,-1,2,1,-5,4};

        Long sum = solution2(input);
        System.out.printf("Sum: %d", sum);
    }

    private static Long solution(Integer[] values) {
        long sum = values[0];
        for(int i = 0; i<values.length; i++){
            long tempSum = 0;
            for(int j = i+1; j<values.length; j++){
                tempSum = sumSubArrayValues(values, i,j);
            }
        }

        return sum;
    }

    private static long sumSubArrayValues(Integer[] values, int i, int j) {
        return Arrays.stream(values).collect(Collectors.summingInt(Integer::intValue));
    }

    private static long solution2(Integer[] values){
        List<Integer> input = Arrays.asList(values.clone());
        Integer max = input.get(0);
        List<Integer> maxContiguousArray = null;

        for (int i = 0; i < input.size(); i++) {

            Integer currentMax = 0;

            for (int j = i + 1; j < input.size(); j++) {
                var contiguousSubArray = input.subList(i,j);
                currentMax = contiguousSubArray.stream().collect(Collectors.summingInt(Integer::intValue));
                if (currentMax > max) {
                    max = currentMax;
                    maxContiguousArray = contiguousSubArray;
                }
            }
        }

        return max;
    }

}
