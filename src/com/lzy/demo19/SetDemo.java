package com.lzy.demo19;

import com.sun.org.apache.xpath.internal.operations.String;

import java.util.*;
import java.util.stream.Stream;

public class SetDemo {


    public static void main(String[] args) {

        Comparator<Student> comparator = (o1, o2) -> o1.getScore() - o2.getScore();
        Set<Student> students = new HashSet();
        for (int i = 0; i < 20; i++) {
            Student student = new Student();
            System.out.println(student);
            students.add(student);
        }
        System.out.println("------------------------------");
        Student max = Collections.max(students, comparator);
        Student min = Collections.min(students, comparator);
        System.out.println(max);
        System.out.println(min);


    }

}

class Student {
    /**
     * id[1-30],grade[1-6],,score[0-100]
     */
    private int id;
    private int grade;
    private int score;

    public Student() {
        Random random = new Random();
        this.id = random.nextInt(30) + 1;
        this.grade = random.nextInt(6) + 1;
        this.score = random.nextInt(101);
    }

    public int getScore() {
        return score;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }


}