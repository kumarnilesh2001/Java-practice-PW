package Loops;

import java.util.Scanner;

public class geoProgression {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the nth term :");
        int input = sc.nextInt();

        System.out.print("Enter Starting point :");
        int a = sc.nextInt();
        System.out.print("Enter Progression :");
        int b = sc.nextInt();

        for(int i = 0; i <= input; i++){
            System.out.println(a);
            a *= b;
        }
    }
}
