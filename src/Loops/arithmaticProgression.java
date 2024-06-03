package Loops;

import java.util.Scanner;

public class arithmaticProgression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        for(int i = 1;i <= (2*input) - 1; i+=2 ){
            System.out.println(i);
        }
    }
}
