package ee.ivkhkdev;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Java Hello!");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 digit number: ");
        int number = sc.nextInt();
        int sum = number % 10;
        System.out.println("sum: " + sum);

        Scanner sc2 = new Scanner(System.in);
        System.out.print("enter name: ");
        String name = sc2.nextLine();
        System.out.print("enter last name: ");
        String lname = sc2.nextLine();
        System.out.print("enter personal code: ");
        int pcode = sc.nextInt();
        System.out.println(name + " " + lname + " " + pcode);


        int summ = 0;
        int[] arr = new int[10];
        for(int i=0; i<10; i++){
            Random rand = new Random();
            int randnum = rand.nextInt(100);
            while(randnum % 2 != 0 || randnum == 0){
                randnum = rand.nextInt(100);

            }
            arr[i] = randnum;
        }
        for(int x=0; x<arr.length; x++){
            summ = arr[x];
            System.out.print(arr[x] + " ");
        }

        int randlength = arr.length;
        double avgsum = summ / randlength;

        System.out.println("\n" + avgsum + " ");

        
    }
}