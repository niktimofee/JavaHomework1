// Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)

package Homework1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Введите число: ");
        int n = sc.nextInt();
        System.out.printf("Треугольное число = %d\n", countTriangleNum(n));
        System.out.printf("Факториал =  %d\n", countFactorialNum(n));
        sc.close();
    }

    public static int countTriangleNum(int i) {
        return (i * (i + 1)) / 2;
    }

    public static int countFactorialNum(int n) {
        if (n == 0)
            return 1;
        else
            return (n * countFactorialNum(n - 1));
    }
}