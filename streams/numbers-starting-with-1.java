import java.util.Arrays;
import java.util.List;

class Solution {
  public static void main(String[] args) {

    List<Integer> list = Arrays.asList(12, 34, 15, 4, 5);

    list.stream().filter((num) -> {
      while (num > 10) {
        num = num / 10;
      }

      if (num == 1) {
        return true;
      }

      return false;

    }).forEach(System.out::println);

  }
}