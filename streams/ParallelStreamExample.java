import java.util.Arrays;

public class ParallelStreamExample {
  public static void main(String[] args) {
    int[] array = new int[1_000_000];
    for (int i = 0; i < array.length; i++) {
      array[i] = i + 1; // Example values
    }

    // Sum using parallelStream
    long sum = Arrays.stream(array)
        .parallel()
        .sum();

    System.out.println("Sum: " + sum);
  }
}