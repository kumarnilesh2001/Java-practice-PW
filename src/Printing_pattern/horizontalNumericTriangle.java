package Printing_pattern;

import java.util.Scanner;

public class horizontalNumericTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int input = sc.nextInt();

        for(int i = 1; i<=input;i++){
            for(int j = 1 ; j <= input + 1 - i ; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
