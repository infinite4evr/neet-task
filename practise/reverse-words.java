
import java.util.Arrays;

class Solution {
  public static void main(String[] args) {
    String s = "Hello World 123";
    System.out.println(Arrays.asList(s.split(" ")).stream().reduce("", (x, y) -> y + " " + x));
  }

}
