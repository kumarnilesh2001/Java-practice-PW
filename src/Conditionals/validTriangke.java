package Conditionals;

import java.util.Scanner;

public class validTriangke {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your first number : ");
        int fst = sc.nextInt();
        System.out.print("Enter your second number : ");
        int sec = sc.nextInt();
        System.out.print("Enter your third number : ");
        int thr = sc.nextInt();

        if( fst + sec > thr && fst + thr >sec && sec + thr > fst){
            System.out.println("This a Valid Triangle !");
        }else{
            System.out.println("This is not a Valid Triangle !");
        }
    }
}
