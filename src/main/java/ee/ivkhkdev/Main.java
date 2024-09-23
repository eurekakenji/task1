package ee.ivkhkdev;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Java Hello!");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 digit number: ");
        int number = sc.nextInt();
        int sum = number % 10;
        System.out.println("sum: " + sum);


    }
}