package com.company;
import java.util.Scanner;
public class Mainn {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Введите целое неотрицательное число меньше 15: ");
       int x;
       if (sc.hasNextInt()) {
           x = sc.nextInt();
           if (x < 0 || x > 15) {
               System.out.println("Вы ввели неподходящее число");
           } else {
               int a = 1;
               int i = x;
               while (i > 0) {
                   a = a * i;
                   i = i - 1;
               }
               System.out.println("Факториал равен: " + a);
           }
       }
   }}

