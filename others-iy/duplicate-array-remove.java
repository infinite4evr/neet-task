import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Solution {
  public static void main(String[] args) {
    int[] arr = { 1, 1, 2, 2, 4, 4 };

    // without stream
    // loop
    // two pointers
    // once all the first non-duplicate elements are done
    // use array split into new array
    int[] arr1 = { 10, 10, 20, 20, 30, 40, 50, 50, 50, 100, 100, 200, 300, 300, 300, 400, 500 };

    int pointer1 = 0;
    int pointer2 = 0;
    while (pointer2 < arr1.length) {
      if (arr1[pointer1] == arr1[pointer2]) {
        pointer2++;
      } else {
        arr1[++pointer1] = arr1[pointer2];

      }
    }

    int[] newArr = Arrays.copyOf(arr1, pointer1 + 1);
    System.out.println(Arrays.toString(newArr));

    // with stream
    List<Integer> arrnew = Arrays.stream(arr).boxed().distinct().collect(Collectors.toList());

    System.out.println(arrnew.toString());

  }
}