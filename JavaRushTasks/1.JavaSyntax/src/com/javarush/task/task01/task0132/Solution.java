package com.javarush.task.task01.task0132;

/* 
Сумма цифр трехзначного числа
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(546));
    }

    public static int sumDigitsInNumber(int number) {
        int a,b,c;
        a = number%10;
        b = (number / 10)%10;
        c = (number / 100)%10;
        return a+b+c;
        //напишите тут ваш код
    }
}