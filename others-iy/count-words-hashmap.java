import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Solution {
  public static void main(String[] args) {

    // Collections.reverse(reversedList)
    // to reverse on any collections

    String str = "Hello World";

    String[] x = str.split(" ");

    String reversed = Arrays.stream(x)
        .reduce("", (m, y) -> y + " " + m)
        .trim();
    System.out.println(reversed);

  }
}