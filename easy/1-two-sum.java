// array question
// hashmap
// loop

import java.util.HashMap;
import java.util.Map;

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