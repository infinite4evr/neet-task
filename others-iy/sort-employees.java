import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Employee implements Comparable {
  public Employee(int id, String name) {
    this.id = id;
    this.name = name;
  }

  public int id;
  public String name;

  @Override
  public int compareTo(Object o) {
    if (o instanceof Employee) {
      Employee e = (Employee) o;
      return this.id < e.id ? -1 : 1;

    }

    return 1;

  }

}

class Solution {

  public static void main(String[] args) {
    List<Employee> emps = new ArrayList<>();
    emps.add(new Employee(5, "Hello"));
    emps.add(new Employee(10, "Ten"));
    Collections.sort(emps);

    // or we can do emps.sort() and provide a comparator method with returns 1 or -1

    emps.forEach(e -> System.out.println(e.id));

  }

}