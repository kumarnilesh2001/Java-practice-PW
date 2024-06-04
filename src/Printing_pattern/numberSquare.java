package Printing_pattern;

import java.util.Scanner;

public class numberSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n :");
        int input1 = sc.nextInt();
        for(int i = 1; i <= input1;i++){
            for(int j = 1 ; j<= input1 ; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
