package Loops;

import java.util.Scanner;

public class tableOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();


        for(int i = input;i <= input * 10 ; i++){
            if(i % input == 0){
                System.out.println( i);
            }


        }
    }
}
