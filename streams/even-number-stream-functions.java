import java.util.Arrays;
import java.util.List;

class Solution {
  public static void main(String[] args) {

    List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

    list.stream().filter(num -> num % 2 == 0).forEach(System.out::println);

  }
}