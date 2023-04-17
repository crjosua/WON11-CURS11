package Exercitiul2;

 import java.util.ArrayList;
        import java.util.HashMap;
        import java.util.List;
        import java.util.Map;

public class Ex2 {
    public static void main(String[] args){
        List<Person> people = new ArrayList<>();
        people.add(new Person("Maria",20,"roscat")); //introducem persoane in lista
        people.add(new Person("Timo",20,"saten"));
        people.add(new Person("Bianca",19,"rosu"));
        people.add(new Person("Marcela",25,"blond"));

        List<String> nume = new ArrayList<>(); //ex 2.1
        for (Person person: people){
            nume.add(person.getName()); //intr-o noua lista adaugam numele acestora
        }
        System.out.println(nume);

        Map<String, Integer> peopleMap = new HashMap<>(); //ex 2.2
        for (Person person: people){
            peopleMap.put(person.getName(), person.getAge());
        }
        System.out.println(peopleMap);

        int givenAge=20; //ex 2.3
        for(Map.Entry<String, Integer> person: peopleMap.entrySet()){
            if(person.getValue()>=givenAge)
                System.out.println(person.getKey());
        }

        Map<String, String> peopleMapHair = new HashMap<>(); //ex 2.4
        for (Person person: people){
            peopleMapHair.put(person.getHair(), person.getName());
        }
        System.out.println(peopleMapHair);

        //La exercitiul 2.5 nu prea inteleg exact ce ar trebui sa fac, adica pentru fiecare varsta trebuie sa am o lista de persoana care au varsta respectiva?
    }
}


