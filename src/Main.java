public class Main {
   private static final Employee[] employee = new Employee[10];
    public static void main(String[] args) {
    employee[0]=new Employee("Екатерина","Савинова","Сергеевна",1,200000.0);

    employee[1]=new Employee("Елена","Суворова","Андреевна",2,100000.0);

    employee[2]=new Employee("Егор","Балов","Степанович",1,250000.0);

    employee[3]=new Employee("Светалана","Ходченкова","Сергеевна",3,20000.0);

    employee[4]=new Employee("Федор","Бондарчук","Сергеевич",1,80000.0);

    employee[5]=new Employee("Алексей","Савинов","Павлович",2,380000.0);

    employee[6]=new Employee("Тимофей","Прилучный","Алексеевич",3,10000.0);

    employee[7]=new Employee("Добрыня","Богатырский","Сергеевич",1,350000.0);

    employee[8]=new Employee("Анджелина","Питт","Джоливна",2,15000.0);

    employee[9]=new Employee("Екатерина","Савинова","Сергеевна",1,200000.0);

    outputFullEmployee();

    sumSalary();

    maxSalary();

    minSalary();

    averageSalary();

    outputFullNameEmployee();

}

    private static void outputFullEmployee() {
        for (int i = 0; i < employee.length; i++) {
            System.out.println(employee[i].toString());
        }
    }

    private static void sumSalary() {
        double total = 0;
        for (int i = 0; i < employee.length; i++) {
            double sum = employee[i].getSalary();
            total = total + sum;

        }
        System.out.println("Сумма затран на зарплаты в месяц: " + total);

    }

    private static void maxSalary() {
        double max = Integer.MIN_VALUE;
        Employee employeeMaxSalary=null;
        for (int i = 0; i < employee.length - 1; i++) {
            if (employee[i].getSalary() > max) {
                max = employee[i].getSalary();
                employeeMaxSalary=employee[i];
            } else {
                max = max;
            }
        }
        System.out.println("Максимальнач зарплата: " + max + " у сотрудника "+employeeMaxSalary.getFullName() );
            }



    private static void minSalary() {
        double min = Integer.MAX_VALUE;
        Employee employeeSalaryMin = null;
        for (int i = 0; i < employee.length; i++) {
            if (employee[i].getSalary() < min) {
                min = employee[i].getSalary();
                employeeSalaryMin=employee[i];

            } else {
                min = min;
            }
        }
        System.out.println("Минимальная зарплата: " + min + " у сотрудника "+employeeSalaryMin.getFullName() );
        }


    private static void averageSalary() {
        double total = 0;
        for (int i = 0; i < employee.length; i++) {
            double sum = employee[i].getSalary();
            total = total + sum;
        }

        System.out.println("Средняя зарплата : " + total / employee.length);
    }

    private static void outputFullNameEmployee() {
        for (int i = 0; i < employee.length; i++) {
            System.out.println(employee[i].getFullName());
        }
    }
}










