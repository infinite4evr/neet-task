import java.util.HashMap;
import java.util.Map;

class Solution {
  public static void main(String[] args) {
    String str = "hello world";
    String str2 = "hello world";

    Map<Integer, Integer> chars = new HashMap<>();


    str.chars().forEach(x -> {
      chars.put(x, chars.getOrDefault(x, 0) + 1);
    });

    str2.chars().forEach(x -> {
      chars.put(x, chars.getOrDefault(x, 0) - 1);
    });

    chars.values().stream().reduce(0, (x, y) ->)



  }
}