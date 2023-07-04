public class Employee extends Person {
    int salary;

    Employee(String name, String surname, int age, String company, int salary) {
        super(name, surname, age, company);
        this.salary = salary;
    }

    void doWork() {
        super.doWork();
        System.out.println("I am employee");
    }

    public int getSalary() {
        return salary;
    }

    public double getSalaryAfterTax() {
        return salary * 0.87;
    }
}
