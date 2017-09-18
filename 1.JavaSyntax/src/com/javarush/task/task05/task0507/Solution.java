package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        float sum = 0f;
        int counter = 0;
        while (true){
            int val = Integer.parseInt(bufferedReader.readLine());
            if (val == -1) break;
            counter++;
            sum = sum + val;
        }
        float d = sum / counter;
        System.out.println(d);
    }
}

