package com.lzy.demo24;

import com.lzy.demo02.Person;

import java.io.*;

public class QianClone {
    public static void main(String[] args) throws CloneNotSupportedException {
        People people = new People("lzy", "28");
        Dog dog = new Dog();
        dog.setDogName("hi");
        people.setDog(dog);

        //People o = (People) people.clone();
        People o = people.DeepClone();
        System.out.println(o);
        people.getDog().setDogName("hello");
        System.out.println(o.getDog().getDogName());
        System.out.println(people.getDog().getDogName());

    }

}

class People implements Cloneable, Serializable {
    String name;
    String age;
    Dog dog;

    public People() {

    }

    public People(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        People clone = (People) super.clone();
        clone.setDog((Dog) clone.dog.clone());
        return clone;

    }

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }


    /**
     * @return
     */
    public People DeepClone() {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();

            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            objectOutputStream.writeObject(this);
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
            ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);


            System.out.println(this);

            return (People) objectInputStream.readObject();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;

    }
}

class Dog implements Cloneable, Serializable {
    private String dogName;

    public Dog(String dogName) {
        this.dogName = dogName;
    }

    public Dog() {

    }

    public String getDogName() {
        return dogName;
    }

    public void setDogName(String dogName) {
        this.dogName = dogName;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
