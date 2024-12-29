import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

class Solution {
  public int removeDuplicates(int[] nums) {

    int pointer1 = 0;
    int pointer2 = 0;

    for (; pointer2 < nums.length; ++pointer2) {
      if (nums[pointer1] != nums[pointer2]) {
        nums[pointer1 + 1] = nums[pointer2];
        pointer1++;
      }

    }

    return pointer1 + 1;

  }
}

// class Solution {
// public int removeDuplicates(int[] nums) {
// // [1,1,2,3,4,5,10,10,5,5]

// // two pointer problem

// // two options
// // make hashmap with keys indicating if such element exists
// // space complexity O(n), time complexity O(n)

// Map<Integer, Boolean> foundElements = new LinkedHashMap<>();

// for (int i = 0; i < nums.length; ++i) {
// foundElements.putIfAbsent(nums[i], true);
// }

// int[] newNums =
// foundElements.keySet().stream().mapToInt(Integer::intValue).toArray();

// for (int i = 0; i < newNums.length; ++i) {
// nums[i] = newNums[i];
// }

// return newNums.length;

// // find if any such index exists
// // o(n2)
// // sort the array
// //

// }
// }
