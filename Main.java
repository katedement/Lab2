package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Введите целое неотрицательное число меньше 15: ");
    int x;
    if (sc.hasNextInt()) {
        x=sc.nextInt();
        if (x<0||x>15) {
            System.out.println("Вы ввели неподходящее число");
        }
        else {
            int a=1;
            for (int i=x; i>0; i=i-1) {
                a=a*i;
            }
            System.out.println("Факториал равен: " + a);
        }
    }
    }
}
