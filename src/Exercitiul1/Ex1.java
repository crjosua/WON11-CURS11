package Exercitiul1;

import java.util.HashMap;
import java.util.Map;

public class Ex1 {
    public static void main(String[] args) {
        Map<String, Integer> note = new HashMap<>();
        note.put("Josh",99);
        note.put("Bianca",100);
        note.put("Timo",45);
        note.put("Georgi",20); //am introdus in Map 4 studenti

        for(Map.Entry<String, Integer> student: note.entrySet()){ //afisam toti studentii si notele acestora
            System.out.println("Studentul " + student.getKey() + " are nota: " + student.getValue());
        }

        String maxStudent="";
        int maxNota=0;
        for(Map.Entry<String, Integer> student: note.entrySet()){ //cautam studentul cu nota cea mai mare
            if(student.getValue() > maxNota){
                maxStudent=student.getKey();
                maxNota= student.getValue();
            }
        }
        System.out.println("Studentul cu cea mai mare nota este: " + maxStudent + " " + maxNota);
    }
}