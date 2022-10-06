public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Employee[] employee = new Employee[10];
        employee[0] = new Employee("Екатерина", "Савинова", "Сергеевна", 1, 200000.0);
        employee[1] = new Employee("Елена", "Суворова", "Андреевна", 2, 100000.0);
        employee[2] = new Employee("Егор", "Балов", "Степанович", 1, 250000.0);
        employee[3] = new Employee("Светалана", "Ходченкова", "Сергеевна", 3, 20000.0);
        employee[4] = new Employee("Федор", "Бондарчук", "Сергеевич", 1, 80000.0);
        employee[5] = new Employee("Алексей", "Савинов", "Павлович", 2, 380000.0);
        employee[6] = new Employee("Тимофей", "Прилучный", "Алексеевич", 3, 10000.0);
        employee[7] = new Employee("Добрыня", "Богатырский", "Сергеевич", 1, 350000.0);
        employee[8] = new Employee("Анджелина", "Питт", "Джоливна", 2, 15000.0);
        employee[9] = new Employee("Екатерина", "Савинова", "Сергеевна", 1, 200000.0);
        outputFullEmployee(employee);
        sumSalary(employee);
        maxSalary(employee);
        minSalary(employee);
        averageSalary(employee);
        outputFullNameEmployee(employee);


    }

    public static void outputFullEmployee(Employee[] employee) {
        for (int i = 0; i < employee.length; i++) {
            System.out.println(employee[i].toString());
        }
    }

    public static void sumSalary(Employee[] employee) {
        double total = 0;
        for (int i = 0; i < employee.length; i++) {
            double sum = employee[i].getSalary();
            total = total + sum;

        }
        System.out.println("Сумма затран на зарплаты в месяц: " + total);

    }

    public static void maxSalary(Employee[] employee) {
        double max = employee[0].getSalary();
        for (int i = 0; i < employee.length - 1; i++) {
            max = Math.max(max, employee[i + 1].getSalary());
        }
        for (int i = 0; i < employee.length; i++) {
            double a = employee[i].getSalary();
            if (a == max) {
                System.out.println("Максимальная зарплата: " + max + " у сотрудника " + employee[i].getFullName());

            }
        }
    }

    public static void minSalary(Employee[] employee) {
        double min = employee[0].getSalary();
        for (int i = 0; i < employee.length; i++) {
            min = Math.min(min, employee[i].getSalary());

        }
        for (int i = 0; i < employee.length; i++) {
            double a = employee[i].getSalary();
            if (a == min) {
                System.out.println("Минимальная зарплата: " + min + " у сотрудника ..." + employee[i].getFullName());
            }
        }
    }

    public static void averageSalary(Employee[] employee) {
        double total = 0;
        for (int i = 0; i < employee.length; i++) {
            double sum = employee[i].getSalary();
            total = total + sum;
        }

        System.out.println("Средняя зарплата : " + total / employee.length);
    }

    public static void outputFullNameEmployee(Employee[] employee) {
        for (int i = 0; i < employee.length; i++) {
            System.out.println(employee[i].getFullName());
        }
    }
}










