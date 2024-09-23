package ee.ivkhkdev;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 1
        System.out.println("Java Hello!");

        // 2
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 digit number: ");
        int number = sc.nextInt();
        int sum = number % 10;
        System.out.println("sum: " + sum);

        // 3
        Scanner sc2 = new Scanner(System.in);
        System.out.print("enter name: ");
        String name = sc2.nextLine();
        System.out.print("enter last name: ");
        String lname = sc2.nextLine();
        System.out.print("enter birth month (ex 'January'): ");
        String bmonth = sc2.nextLine();
        System.out.print("enter birth day (ex 4): " );
        int bday = sc2.nextInt();
        System.out.print("enter birth year (ex '1984'): ");
        int byear = sc2.nextInt();
        System.out.println(name + " " + lname + "born on" + bday + " " + bmonth + " " + byear + " ");


        // 4
        int summ = 0;
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            Random rand = new Random();
            int randnum = rand.nextInt(100);
            while (randnum % 2 != 0 || randnum == 0) {
                randnum = rand.nextInt(100);

            }
            arr[i] = randnum;
        }
        for (int x = 0; x < arr.length; x++) {
            summ = arr[x];
            System.out.print(arr[x] + " ");
        }

        int randlength = arr.length;
        double avgsum = (double) summ / randlength;

        System.out.println("\n" + avgsum + " ");

        // 5
        int[][] jagarr = new int[5][];
        jagarr[0] = new int[3];
        jagarr[1] = new int[5];
        jagarr[2] = new int[7];
        jagarr[3] = new int[8];
        jagarr[4] = new int[9];
        Random ran = new Random();
        for (int x = 0; x < jagarr.length; x++) {
            for (int y = 0; y < jagarr[x].length; y++) {
                jagarr[x][y] = ran.nextInt(51) + 50;
            }
        }
        System.out.println("unsorted: ");
        for (int j = 0; j < jagarr.length; j++) {
            for (int y = 0; y < jagarr[j].length; y++)
                System.out.print(jagarr[j][y] + " ");
            System.out.println();
        }
        System.out.println("sorted: ");
        System.out.println();
        for (int i = 0; i < jagarr.length; i++) {
            Arrays.sort(jagarr[i]);

        }
    }
}