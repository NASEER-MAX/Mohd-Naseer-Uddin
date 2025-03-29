package authenticationExample.demo;

import java.util.*;

class Employee1 {
    int id;
    String name;
    public Employee1(int id, String name) {this.id = id;this.name = name; }
}

// Custom comparator for sorting by name
class NameComparator implements Comparator<Employee1> {
    @Override
    public int compare(Employee1 e1, Employee1 e2) {
        return e1.name.compareTo(e2.name);
    }
}

public class ComparatorExample {
    public static void main(String[] args) {
        List<Employee1> Employee1s = new ArrayList<>();
        Employee1s.add(new Employee1(3, "Alice"));
        Employee1s.add(new Employee1(1, "Bob"));
        Employee1s.add(new Employee1(2, "Charlie"));

        Collections.sort(Employee1s, new NameComparator()); // Sort using Comparator

        System.out.println("Sorted Employee1s (by Name):");
        for (Employee1 e : Employee1s) {
            System.out.println(e);
        }
    }
}
