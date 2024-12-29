class Solution {
  public static void main(String[] args) {
    String str = "Hello World";
    String m = str.substring(0, 7);
    char[] arr = m.toCharArray();
    arr[1] = '5';
    System.out.println(str);

  }
}