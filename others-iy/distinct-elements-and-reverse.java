import java.util.Arrays;
import java.util.List;

class Solution {

  public static void main(String[] args) {
    List<Integer> list = Arrays.asList(1, 3, 2, 4, 3, 1, 2);

    list.stream().distinct().sorted((x, y) -> x > y ? -1 : 1).forEach(System.out::println);

    Arrays.stream(null)
    Arrays.asList(null)

  }

}