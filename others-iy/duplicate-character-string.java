import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Solution {
  public static void main(String[] args) {
    String str = "Hello World";

    char[] x = str.toCharArray();

    Map<Character, Integer> chars = new HashMap<>();

    for (int i = 0; i < x.length; ++i) {
      chars.put(x[i], chars.getOrDefault(x[i], 0) + 1);
    }

    for (Map.Entry<Character, Integer> entry : chars.entrySet()) {
      if (entry.getValue() > 1) {
        System.out.println(entry.getKey() + " appears " +
            entry.getValue() + " times");
      }
    }

  }
}