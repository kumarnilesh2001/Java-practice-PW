package Printing_pattern;

import java.util.Scanner;

public class rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows :");
        int input1 = sc.nextInt();
        System.out.print("Enter columns :");
        int input2 = sc.nextInt();
        for (int i= 1 ; i<=input1; i++){
            for(int j = 1 ; j <= input2 ; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
