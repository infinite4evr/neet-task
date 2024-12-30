import java.util.Arrays;
import java.util.stream.Collectors;

public class CamelCaseConverter {
  public static void main(String[] args) {
    String s = "my_name_is_hello";

    char m = 'm';

    s = s + m;

    String camelCase = Arrays.stream(s.split("_"))
        .map(word -> word.isEmpty() ? word : Character.toUpperCase(word.charAt(0)) + word.substring(1))
        .collect(Collectors.joining());

    // Ensure the first character remains lowercase
    if (!camelCase.isEmpty()) {
      camelCase = Character.toLowerCase(camelCase.charAt(0)) + camelCase.substring(1);
    }

    System.out.println(camelCase); // Output: myNameIsHello
  }
}
