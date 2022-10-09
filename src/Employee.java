public class Employee {
    private String name;
    private String surname;
    private String middleName;
    private int department;
    private double salary;
    private static int idCounter =1;
    private int id = idCounter;


    public Employee(String name, String surname, String middleName, int department, double salary) {
        this.name = name;
        this.surname = surname;
        this.middleName = middleName;
        this.department = department;
        this.salary = salary;
        idCounter++;
    }

    public String getName() {
        return name;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getSurname() {
        return surname;
    }

    public int getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }
    public String getFullName(){
        return name + " "+middleName +" "+ surname;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return  "ФИО:" + name + " " + middleName + " " + surname +
                ", отдел №" + department + ", зарплата: " + salary + ", №id=" + id;
    }

    }
