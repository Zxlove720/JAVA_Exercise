package JavaExercise20241003;

import java.util.List;

public class JavaExercise {
    public static void main(String[] args) {

    }
}


class Employee {
    public int id;
    public int importance;
    public List<Integer> subordinates;
}

class Solution {
    public int getImportance(List<Employee> employees, int id) {
        int value = 0;
        return takevalue(employees, id, value);
    }

    public int takevalue(List<Employee> employees, int id, int value) {
        List<Integer> subordinate = null;
        for (Employee employee : employees) {
            if (employee.id == id) {
                value += employee.importance;
                subordinate = employee.subordinates;
            }
        }

        if (subordinate == null) {
            return value;
        }

        for (int subordinateID : subordinate) {
            value = takevalue(employees, subordinateID, value);
        }

        return value;
    }
}
