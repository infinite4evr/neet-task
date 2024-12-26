import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Solution {
  public static void main(String[] args) {
    String str = "Hello World";

    char[] x = str.toCharArray();

    for (int i = 0; i < x.length / 2; ++i) {

      char temp = x[i];
      x[i] = x[x.length - i - 1];
      x[x.length - i - 1] = temp;

    }

    System.out.println(new String(x));

  }
}