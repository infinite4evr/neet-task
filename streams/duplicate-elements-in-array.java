import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Solution {
  public static void main(String[] args) {
    List<Integer> list = Arrays.asList(1, 1, 2, 3, 4, 4); // or List.of(1,2,3,4);

    Set<Integer> set = new HashSet<>();

    list.stream().filter(num -> !set.add(num)).forEach(System.out::println);
  }
}