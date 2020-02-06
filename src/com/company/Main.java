package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Worker> stud = new ArrayList<>();

        stud.add(new Worker("Alan", 85, "alan4@gmail.com"));
        stud.add(new Worker("Petrov", 30, "petrov@gmail.com"));
        stud.add(new Worker("Sidorov", 55, "sidorov@gmail.com"));
        stud.add(new Worker("Ivanov", 22, "ivanov@gmail.com"));
        stud.add(new Worker("Alan", 37, "alan1@gmail.com"));

        System.out.println("dont sort");
        System.out.println(stud);

        Comparator<Worker> SORT_BY_AGE = new Comparator<Worker>() {
            @Override
            public int compare(Worker w1, Worker w2) {
                return w1.getAge() - w2.getAge();
            }
        };

        Collections.sort(stud,SORT_BY_AGE);
        System.out.println("SORT BY AGE");
        System.out.println(stud);
    }
}
