import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

class Solution {
  public static void main(String[] args) {
    Map<String, Integer> map = new HashMap<>();
    map.put("A", 1);
    map.put("B", 2);
    map.put("C", 3);

    List<Entry<String, Integer>> s = map.entrySet().stream()
        .sorted((Entry<String, Integer> entry1, Entry<String, Integer> entry2) -> {

          return entry1.getValue() > entry2.getValue() ? -1 : 1;

        }).collect(Collectors.toList());

    for (Entry<String, Integer> s1 : s) {
      System.out.println(s1.getKey() + " " + s1.getValue());
    }

  }
}