// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

import java.util.Scanner;

public class Main {

    public static void main(String[] args)  {

        Scanner con = new Scanner(System.in);
        int num_lab;
        System.out.println("Лабораторні роботи");
        System.out.print("Введіть номер роботи (1-3):");
        try {
            num_lab = con.nextInt();
            if ((1 <= num_lab) && (num_lab <= 3)) {
                System.out.println("Вибрано лабораторну роботу №: " + num_lab);
            } else {
                throw new Exception("Номер лабораторної роботи має бути від 1 до 3");
            }
        } catch (Exception e) {
            System.out.println("Помилка вводу номеру лабораторної роботи");
            System.out.println(e.getMessage());
        }
    }
}