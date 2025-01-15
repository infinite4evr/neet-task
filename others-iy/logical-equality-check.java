
/**
 * Apologies for the confusion earlier. You are right—when you run the code and
 * see the output as `true true`, the behavior is explained by **Java's Integer
 * caching mechanism** and **autoboxing**. Here's why this happens:
 *
 * ### Key Concept: Integer Caching in Java
 * In Java, **autoboxing** is the process of converting a primitive type to its
 * corresponding wrapper class (e.g., converting `int` to `Integer`). However,
 * when it comes to **Integer values** between `-128` and `127`, Java has a
 * special optimization called **Integer Caching**. This means that for any
 * `Integer` values within this range, Java reuses **pre-existing Integer
 * objects** from a cache, rather than creating new instances.
 *
 * ### Detailed Explanation:
 *
 * 1. **Autoboxing and the Integer cache**:
 * - The values of `a = 5` and `b = 5` are both autoboxed from the primitive
 * `int` value `5` into `Integer` objects.
 * - Since `5` is within the **Integer cache range** (`-128` to `127`), instead
 * of creating new `Integer` objects for `a` and `b`, Java uses the **same
 * cached object** for both `a` and `b`.
 *
 * 2. **`a == b` (Reference comparison)**:
 * - In this case, both `a` and `b` refer to the **same `Integer` object** from
 * the cache (because they have the same value and are within the cache range).
 * - As a result, the `==` operator, which compares references, will return
 * `true`, since both `a` and `b` point to the same object.
 *
 * 3. **`a.equals(b)` (Value comparison)**:
 * - The `equals` method checks whether the values of the two `Integer` objects
 * are the same.
 * - Since both `a` and `b` contain the same value (`5`), the `equals` method
 * will also return `true`.
 *
 * ### Summary:
 * - Both `a == b` and `a.equals(b)` return `true` because:
 * - `a == b` returns `true` because both `a` and `b` refer to the same cached
 * `Integer` object (due to the `5` being within the cache range).
 * - `a.equals(b)` returns `true` because both `a` and `b` have the same value
 * (`5`).
 *
 * Thus, the output of your code will indeed be:
 *
 * ```
 * true
 * true
 * ```
 */
class Solution {
  public static void main(String[] args) {
    Object a = 55555;
    Object b = 55555;
    System.out.println(a == b);
    System.out.println(a.equals(b));
  }
}