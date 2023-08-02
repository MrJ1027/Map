package com.jtl.Map_;

import com.sun.javaws.IconUtil;

import java.util.*;

/**
 * @author jtl
 * java学习用
 * 键：学生对象
 * 值：籍贯
 * 存储几个键值对元素，并遍历，如果同姓名、同年龄就认为是同一个学生
 *
 */
public class HashMapExercise01 {
    public static void main(String[] args) {
        HashMap<Student, String> hashMap = new HashMap<>();
        hashMap.put(new Student("jtl",18),"湖南");
        hashMap.put(new Student("cqh",20),"广东");
        hashMap.put(new Student("cqh",20),"广东");
        hashMap.put(new Student("yzq",22),"浙江");
        System.out.println("++++++++键值对遍历++++++++");
        Set<Map.Entry<Student, String>> entries = hashMap.entrySet();
        for (Map.Entry<Student, String> entry : entries) {
            System.out.println(entry.getKey() + "-" + entry.getValue());
        }
        System.out.println("++++++++键找值遍历+++++++++");
        Set<Student> students = hashMap.keySet();
        Iterator<Student> iterator = students.iterator();
        while(iterator.hasNext()){
            Object obj = iterator.next();
            System.out.println(obj + hashMap.get(obj));
        }
    }
}

class Student{
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age &&
                Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}