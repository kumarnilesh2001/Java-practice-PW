package Conditionals;

import java.util.Scanner;

public class evenOdd {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number : ");
        int num = sc.nextInt();
        if(num < 0){
            System.out.println(num + " is a negative (-ve) number!");
        }
        else if(num % 2 == 0){
            System.out.println(num + " is a even number!");
        }
        else{
            System.out.println(num + " is a odd number!");
        }
    }
}
