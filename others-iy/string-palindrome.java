import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Solution {
  public static void main(String[] args) {

    // Collections.reverse(reversedList)
    // to reverse on any collections

    String str = "aabdsdfdbaa";

    for (int i = 0; i < str.length() / 2; ++i) {
      if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
        System.out.println("Not Palindrome");
        return;
      }
    }

    System.out.println(" Palindrome");

    return;

  }
}