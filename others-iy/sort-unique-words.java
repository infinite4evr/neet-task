import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

class Solution {
  public static void main(String[] args) {
    String str = "Hello World Hello World TT";
    // using java 8

    String[] split = str.split(" ");

    Arrays.sort(split);

    Set<String> splitStrings = new HashSet<>();

    for (String word : split) {
      splitStrings.add(word);
    }

    splitStrings.forEach(System.out::println);

  }
}