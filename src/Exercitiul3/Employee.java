package Exercitiul3;

 public class Employee extends Person{
    private String company;
    private int salary;
    public Employee(String name, int age, String hair, String company, int salary) {
        super(name, age, hair);
        this.company = company;
        this.salary = salary;
    }
    public String getCompany() {
        return company;
    }
    public int getSalary() {
        return salary;
    }
}


