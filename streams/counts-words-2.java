
import java.util.*;

class Main {
  public static void main(String[] args) {
    String s = "Hello World World";
    Map<String, Integer> counts = new HashMap<>();

    Arrays.asList(s.split(" ")).stream().forEach(word -> {
      counts.put(word, counts.get(word) == null ? 1 : counts.get(word) + 1);

    });

    counts.forEach((x, y) -> System.out.println(x + y));

  }
}