package com.jtl.Map_;
import com.jtl.Map_.Student;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.*;

/**
 * @author jtl
 * java学习用
 */
public class HashMapExercise02 {
    public static void main(String[] args) {
        String[] arr = {"A","B","C","D"};
        ArrayList<String> list = new ArrayList<>();
        Random random = new Random();
        for(int i = 0; i < 80; i++){
            int index = random.nextInt(arr.length);
            list.add(arr[index]);
        }

        HashMap<String,Integer> hashMap = new HashMap<>();
        for (String name : list) {
            if(hashMap.containsKey(name)){
                int count = hashMap.get(name);
                count++;
                hashMap.put(name, count);
            }else{
                hashMap.put(name,1);
            }
        }

        System.out.println(hashMap);
        int max = 0;
        Set<Map.Entry<String, Integer>> entries = hashMap.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            int count = entry.getValue();
            if(count > max){
                max = count;
            }
        }
        for (Map.Entry<String, Integer> entry : entries) {
            int count = entry.getValue();
            if(count == max){
                System.out.println(entry.getKey());
            }
        }
        System.out.println(max);

    }
}
