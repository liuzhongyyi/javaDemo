//package com.lzy.demo18;
//
//import java.util.*;
//
//public class SetDemo {
//    public static void main(String[] args) {
//
//    }
//
//    static void addStudent(Student student, HashSet set) {
//        set.add(student);
//    }
//
//    static void getRandomNum() {
//        HashSet set = new HashSet();
//        Random random = new Random();
//        {
//            while (true) {
//                set.add(random.nextInt(30) + 1);
//                if (set.size() == 10) {
//                    break;
//
//                }
//            }
//        }
//    }
//
//    static void ptintSet() {
//        HashSet set = new HashSet();
//        Scanner scanner = new Scanner(System.in);
//        String s = scanner.nextLine();
//        char[] chars = s.toCharArray();
//        for (int i = 0; i < s.toCharArray().length; i++) {
//            set.add(chars[i]);
//        }
//    }
//
//}
//
//class Student {
//    String classes;
//    private String username;
//    private int age;
//    private Date birthday;
//
//    public String getUsername() {
//        return username;
//    }
//
//    public void setUsername(String username) {
//        this.username = username;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//
//    public Date getBirthday() {
//        return birthday;
//    }
//
//    public void setBirthday(Date birthday) {
//        this.birthday = birthday;
//    }
//
//    public String getClasses() {
//        return classes;
//    }
//
//    public void setClasses(String classes) {
//        this.classes = classes;
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Student student = (Student) o;
//        return Objects.equals(username, student.username);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(username);
//    }
//}
