import java.util.Arrays;

class Solution {
  public static void main(String[] args) {
    int num = 123;

    // int numTotal =
    // Arrays.asList(String.valueOf(num).toCharArray()).stream().reduce(0,
    // (x, y) -> Integer(x) + Integer(y));
    // System.out.println(numTotal);

    System.out.println(String.valueOf(num)
        .chars()
        .map(Character::getNumericValue)
        .sum());
  }
}