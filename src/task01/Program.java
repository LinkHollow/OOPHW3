package task01;

import java.util.Arrays;
import java.util.Random;

public class Program {

    static Random random = new Random();

    /**
     * TODO: Переработать метод generateEmployee в рамках домашнего задания,
     *  метод должен генерировать рабочих (task01.Employee) разных типов.
     *
     * @return
     */



    static Employee generateEmployee(){
        String[] names = new String[] { "Анатолий", "Глеб", "Клим", "Мартин", "Лазарь", "Владлен", "Клим", "Панкратий", "Рубен", "Герман" };
        String[] surnames = new String[] { "Григорьев", "Фокин", "Шестаков", "Хохлов", "Шубин", "Бирюков", "Копылов", "Горбунов", "Лыткин", "Соколов" };

        int salary = random.nextInt(20000, 80000);
        int randomEmployee = random.nextInt(0, 2);
        int hours = random.nextInt(5, 180);
        int payHours = random.nextInt(500, 1500);
        return switch (randomEmployee) {
            case 0 ->
                    new Worker(names[random.nextInt(2)], surnames[random.nextInt(2)], salary, random.nextInt(18, 20));
            case 1 ->
                    new Freelancer(names[random.nextInt(2)], surnames[random.nextInt(2)], salary, random.nextInt(18, 20), hours, payHours);
            default -> null;
        };


    }


    /**
     * TODO: Придумать новые состояния для наших сотрудников
     *   Придумать несколько Comparator'ов для сортировки сотрудников
     *   по фамилии + имени или по возрасту + уровню зп.
     */
    static void employeeListShow(Employee[] employees){
        for (Employee employee: employees) {
            System.out.println(employee);
        }
        System.out.println("---Разделитель___");
    }
    public static void main(String[] args) {

        Employee[] employees = new Employee[10];
        for (int i = 0; i < employees.length; i++)
        {
            employees[i] = generateEmployee();
        }

        Arrays.sort(employees);
        System.out.println("Сортировка по имени и заработной плате");
        employeeListShow(employees);

        Arrays.sort(employees, new NameSurnameComparator<Employee>());
        System.out.println("Сортировка по Имени и Фамилии");
        employeeListShow(employees);

        Arrays.sort(employees, new AgeSalaryComparator<Employee>());
        System.out.println("Сортировка по возрасту и заработной плате");
        employeeListShow(employees);



    }

}
