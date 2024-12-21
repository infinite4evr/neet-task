
import java.lang.Math;

class Solution {
  public boolean isPalindrome(int x) {
    if (x < 0) {
      return false;
    }

    double reversed = 0;
    int number = x;

    while (number > 0) {
      int temp = number % 10;
      number = number / 10;
      reversed = reversed * 10 + temp;
    }
    return reversed == x;
  }
}