import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Solution {
  public static void main(String[] args) {
    int[] arr = { 0, 0, 5, 7, 4, 5, 0 };

    int pointer1 = 0;
    int pointer2 = 1;
    while (pointer1 < arr.length - 1 && pointer2 < arr.length - 1) {
      if (arr[pointer1] == 0) {
        while (pointer2 < arr.length - 1 && arr[pointer2] == 0) {
          pointer2++;
        }

        if (pointer2 == arr.length) {
          break;
        }

        System.out.println("Replacing " + arr[pointer1] + " " + pointer1 + " with " + arr[pointer2] + " " + pointer2);

        arr[pointer1] = arr[pointer2];
        arr[pointer2] = 0;
      }

      pointer1++;

    }

    System.out.println(Arrays.toString(arr));

  }

}