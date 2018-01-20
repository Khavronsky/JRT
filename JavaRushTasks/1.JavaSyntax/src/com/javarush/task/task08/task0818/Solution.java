package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static HashMap<String, Integer> createMap() {
        return new HashMap<String, Integer>() {{
            for (int i = 0; i < 10; i++) {
                put("name" + i, 100 * i);
            }
        }};
        //напишите тут ваш код
    }

    public static void removeItemFromMap(HashMap<String, Integer> map) {
        System.out.println(map);
        HashMap<String, Integer> copyMap = new HashMap<>(map);
        for (Map.Entry<String, Integer> mappy :
                copyMap.entrySet()) {
            if ( mappy.getValue() < 500){
                map.remove(mappy.getKey());
            }
        }
        //напишите тут ваш код"
    }

    public static void main(String[] args) {

    }
}