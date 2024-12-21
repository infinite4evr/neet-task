//classical stack based solution

import java.util.HashMap;
import java.util.Map;

class Solution {
  public boolean isValid(String s) {

    Map<Character, Character> chars = new HashMap<>();
    chars.put(')', '(');
    chars.put('}', '{');
    chars.put(']', '[');

    StringBuffer b = new StringBuffer();

    for (int i = 0; i < s.length(); ++i) {
      if (chars.containsKey(s.charAt(i))) {

        if (b.length() == 0) {
          return false;
        }

        if (b.charAt(b.length() - 1) != chars.get(s.charAt(i))) {
          return false;
        }

        b.deleteCharAt(b.length() - 1);

      } else {
        b.append(s.charAt(i));
      }

    }

    if (b.length() == 0) {
      return true;
    }

    return false;

  }
}
