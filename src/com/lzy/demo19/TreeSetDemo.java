//package com.lzy.demo19;
//
//import lombok.Getter;
//import lombok.Setter;
//import lombok.ToString;
//import lombok.Value;
//
//import java.util.Comparator;
//import java.util.function.BiFunction;
//import java.util.function.Function;
//
//public class TreeSetDemo {
//    public static void main(String[] args) {
//        int compose = compose(value -> value + 1, value -> value *2, 2);
//        System.out.println(compose);
//        int addThen = addThen(value -> value + 1, value -> value *2, 2);
//        System.out.println(addThen);
//        int thenbic = addThenbic((value, num) -> value + num,value->value+1, 1, 2);
//        System.out.println(thenbic);
//    }
//    static  int compose(Function<Integer,Integer> fun1,Function<Integer,Integer> fun2,int value)
//    {
//       return fun1.compose(fun2).apply(value);
//    }
//    static  int addThen(Function<Integer,Integer> fun1,Function<Integer,Integer> fun2,int value)
//    {
//        return fun1.andThen(fun2).apply(value);
//    }
//    static int addThenbic(BiFunction<Integer,Integer,Integer> function1,Function<Integer,Integer> function ,int value,int num){
//        return  function1.andThen(function).apply(value,num);
//    }
//
//
//
//}
//
//class myComparator implements Comparator<Student> {
//    public double getSum(Student student) {
//        return student.getCSorcce() + student.getESorcce() + student.getMSorcce();
//    }
//
//    @Override
//    public int compare(Student o1, Student o2) {
//        return getSum(o2) - getSum(o1) == 0 ? 0 : getSum(o2) > getSum(o1) ? 1 : -1;
//    }
//}
//
//@ToString
//@Setter
//@Getter
//class Student {
//    private String name;
//    private double cSorcce;
//    private double mSorcce;
//    private double eSorcce;
//
//}
//

