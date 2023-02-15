// Реализовать простой калькулятор 

package Homework1;

import java.util.Scanner;

public class Task3 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int num1 = getInt();
        int num2 = getInt();
        char op = getOperation();
        int result = calc(num1,num2,op);
        System.out.printf("%d %s %d = %d", num1, op, num2, result);
    }

    public static int getInt(){
        System.out.print("Введите число: ");
        int num;
        if(sc.hasNextInt()){
            num = sc.nextInt();
        } else {
            System.out.println("Ошибка при вводе числа! Попробуйте ещё раз.");
            sc.next();
            num = getInt();
        }
        return num;
    }

    public static char getOperation(){
        System.out.print("Введите операцию (+, -, *, /) : ");
        char op;
        if(sc.hasNext()){
            op = sc.next().charAt(0);
        } else {
            System.out.println("Ошибка при вводе операции! Попробуйте ещё раз.");
            sc.next();
            op = getOperation();
        }
        return op;
    }

    public static int calc(int num1, int num2, char op){
        int result;
        switch (op){
            case '+':
                result = num1+num2;
                break;
            case '-':
                result = num1-num2;
                break;
            case '*':
                result = num1*num2;
                break;
            case '/':
                result = num1/num2;
                break;
            default:
                System.out.println("Операция не распознана! Попробуйте ещё раз.");
                result = calc(num1, num2, getOperation());
        }
        return result;
    }
}