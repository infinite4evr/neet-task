
// import java.lang.Math;
// import java.util.Arrays;

// class Solution {
//   public boolean isPalindrome(int x) {
//     if (x < 0) {
//       return false;
//     }

//     double reversed = 0;
//     int number = x;

//     while (number > 0) {
//       int temp = number % 10;
//       number = number / 10;
//       reversed = reversed * 10 + temp;
//     }
//     int[] x  = {1, 2};
//     Arrays.stream(x).
//     return reversed == x;
//   }
// }

// Online Java Compiler
// Use this editor to write, compile and run your Java code online

import java.util.*;

class Main {
  public static void main(String[] args) {
    String str = "airxria";

    System.out.println(str == str.chars().reduce(0, (x, y) -> (char) x + " " + (char) y));
  }
}