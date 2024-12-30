import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

class Solution {
  public static void main(String[] args) {
    String str = "letter";

    Set<Character> chars = new HashSet<>();

    System.out
        .println(str.chars().mapToObj(c -> (char) c).filter((x) -> chars.add(x)).map(String::valueOf).reduce("",
            (x, y) -> y + x));

  }
}