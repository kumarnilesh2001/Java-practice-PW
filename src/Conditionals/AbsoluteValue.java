package Conditionals;

import java.util.Scanner;

public class AbsoluteValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number : ");
        int num = sc.nextInt();

//        if(num < 0){
//            System.out.println(-num);
//        }else{
//            System.out.println(num);
//        }
        System.out.println(Math.abs(num));

    }
}
