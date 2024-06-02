package Conditionals;

import java.util.Scanner;

public class greatestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your first number : ");
        int fst = sc.nextInt();
        System.out.print("Enter your second number : ");
        int sec = sc.nextInt();
        System.out.print("Enter your third number : ");
        int thr = sc.nextInt();

        if(fst > sec && fst > thr){
            System.out.println("First number is greatest number !");
        }else if(sec > fst && sec > thr){
            System.out.println("Second number is the greatest number");
        }else if(thr > fst && thr > sec){
            System.out.println("Third number is the greatest number");
        }else{
            if(fst == sec && fst == thr){
                System.out.println("All number are same");
            }
            else{

            System.out.println("All numbers are same");
            }
        }
    }
}
