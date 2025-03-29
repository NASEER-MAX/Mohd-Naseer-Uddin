package authenticationExample.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class EmployeeComparable implements Comparable<EmployeeComparable> {
    int id;
    String name;

    public EmployeeComparable(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public int compareTo(EmployeeComparable e) {
        return this.name.compareTo(e.name); // Sorting based on ID
//        return Integer.compare(this.id,e.id); // Sorting based on ID?
    }

    public static void main(String[] args) {
        List<EmployeeComparable> employees = new ArrayList<>();
        employees.add(new EmployeeComparable(3, "Alice"));
        employees.add(new EmployeeComparable(1, "Bob"));
        employees.add(new EmployeeComparable(2, "Charlie"));

        Collections.sort(employees); // Sort using Comparable

        System.out.println("Sorted EmployeeComparables (by ID):");
        for (EmployeeComparable e : employees) {
            System.out.println(e.id);
        }
    }
}




