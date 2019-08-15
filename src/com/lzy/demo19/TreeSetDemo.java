package com.lzy.demo19;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Comparator;

public class TreeSetDemo {


}

class myComparator implements Comparator<Student> {
    public double getSum(Student student) {
        return student.getCSorcce() + student.getESorcce() + student.getMSorcce();
    }

    @Override
    public int compare(Student o1, Student o2) {
        return getSum(o2) - getSum(o1) == 0 ? 0 : getSum(o2) > getSum(o1) ? 1 : -1;
    }
}

@ToString
@Setter
@Getter
class Student {
    private String name;
    private double cSorcce;
    private double mSorcce;
    private double eSorcce;

}


