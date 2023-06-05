package task01;

import java.util.Comparator;

public class AgeSalaryComparator<E> implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        int res = Integer.compare(o1.getAge(), o2.getAge());
        if (res == 0){
            return Double.compare(o1.calculateSalary(), o2.calculateSalary());
        }
        return res;
    }
}
