import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class Solution {
  public static void main(String[] args) {
    String str = "Hello world world something world";

    Set<String> strWords = new HashSet<>();

    // Arrays.asList(str.split(" ")).stream().filter(word ->
    // strWords.add(word)).forEach(System.out::println);

    str = Arrays.asList(str.split(" ")).stream().filter(word -> strWords.add(word)).reduce("", (x, y) -> x + " " + y);
    System.out.println(str);

  }
}