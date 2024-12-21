class Solution {
  public String longestCommonPrefix(String[] strs) {

    // Newbie approach
    // algorithm is
    // longest prefix
    // find the shortest string in the array
    // use it as a base string for the lookup

    // Approach 2
    // sort the string array and depend on the alphabetical sorting
    // https://leetcode.com/problems/longest-common-prefix/solutions/3174307/well-explained-code-using-strings-in-java/

    // newbie approch
    // find the smallest element
    // forgive : the names
    int smallest = 99999;
    String smallestMatch = "";

    for (int i = 0; i < strs.length; ++i) {
      if (strs[i].length() < smallest) {
        smallest = strs[i].length();
        smallestMatch = strs[i];
      }
    }

    int longestPrefix = smallest;

    for (int i = 0; i < strs.length; ++i) {
      for (int j = 0; j < longestPrefix; ++j) {
        if (strs[i].charAt(j) != smallestMatch.charAt(j)) {
          longestPrefix = j;
          break;
        }

      }
    }

    return smallestMatch.substring(0, longestPrefix);

  }
}