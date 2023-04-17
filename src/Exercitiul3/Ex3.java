package Exercitiul3;

 import java.util.ArrayList;
        import java.util.List;

public class Ex3 {
    public static void main(String[] args){
        List<Employee> angajati = new ArrayList<>();
        angajati.add(new Employee("Timo", 20, "blond","acasa",1000)); //adaugam persoane in lista
        angajati.add(new Employee("Josh", 20, "roscat","bosch",12345));
        angajati.add(new Employee("Bianca", 19, "rosu","tiktok",100000));
        angajati.add(new Employee("Ana", 25, "blond","tiktok",9999999));

        int givenSalary=1000; //ex 3.1
        for (Employee person: angajati){
            if(person.getSalary()>=givenSalary)
                System.out.println(person.getName());
        }

        int sum=0; //ex 3.3
        for (Employee person: angajati){
            sum=sum+ person.getSalary();
        }
        System.out.println("Suma totala a angajatiilor este " + sum);

        //La 3.2 nu inteleg cerinta, iar la 3.4 o inteleg, dar nu stiu cum sa o fac
    }
}


