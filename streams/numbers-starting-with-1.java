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

// // Online Java Compiler
// // Use this editor to write, compile and run your Java code online
// import java.util.*;

// class Main {
// public static void main(String[] args) {
// Integer[] num = { 1, 2, 3, 4, 15 };
// Arrays.asList(num).stream().map(String::valueOf).filter((String x) ->
// x.charAt(0) == '1')
// .forEach(System.out::println);
// }
// }