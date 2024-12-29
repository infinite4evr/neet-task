// array question
// hashmap
// loop

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

class Solution {
  public int[] twoSum(int[] nums, int target) {

    Map<Integer, Integer> storeCompliments = new HashMap<>();

    int[] numbers = new int[2];

    for (int i = 0; i < nums.length; ++i) {
      if (storeCompliments.get(nums[i]) != null) {

        numbers[0] = storeCompliments.get(nums[i]);
        numbers[1] = i;

        return numbers;
      } else {
        storeCompliments.put(target - nums[i], i);
      }
    }

    return numbers;

  }
}

class Solution1 {
  public static void main(String[] args) {

    Map<Integer, Integer> complement = new HashMap<>();

    int[] arr = { 1, 2, 3, 4, 5, 6 };

    Stream.of(1, 2, 3).forEach(x -> {
      System.out.println(x);
    });

    // return arr;

  }
}
