package com.jtl.Map_;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author jtl
 * java学习用
 */
public class MapExercise {
    public static void main(String[] args) {
        HashMap hashMap = new HashMap();
        Employee jtl = new Employee("jtl", 30000, "110");
        Employee cqh = new Employee("cqh", 20000, "120");
        Employee zhy = new Employee("zhy", 10000, "119");
        hashMap.put(jtl.getId(),jtl);
        hashMap.put(cqh.getId(),cqh);
        hashMap.put(zhy.getId(),zhy);

        Set entrySet = hashMap.entrySet();
        for(Object obj : entrySet){
            Map.Entry entry = (Map.Entry) obj;
            Employee value = (Employee) entry.getValue();
            if(value.getSal() > 10000) {
                System.out.println(value);
            }
        }
        System.out.println("----------------------");
        Set keySet = hashMap.keySet();
        for(Object key : keySet){
            //获取value
            Employee emp = (Employee) hashMap.get(key);
            if(emp.getSal() > 10000) {
                System.out.println(emp);
            }
        }

    }
}

class Employee{
    private String name;
    private double sal;
    private String id;

    public Employee(String name, double sal, String id) {
        this.name = name;
        this.sal = sal;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", sal=" + sal +
                ", id='" + id + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public double getSal() {
        return sal;
    }
}
