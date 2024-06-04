package Printing_pattern;

import java.util.Scanner;

public class square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows :");
        int input = sc.nextInt();
        for(int i = 1; i <= input; i++){
            System.out.print(i + " - ");
            for(int j = 1; j <= input; j++){
                System.out.print( "* ");

            }
            System.out.println();
        }
    }
}
