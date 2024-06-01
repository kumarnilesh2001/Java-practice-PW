package Conditionals;

import java.util.Scanner;

public class profitLoss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Cost price : ");
        int cp = sc.nextInt();
        System.out.print("Enter your Selling price : ");
        int sp = sc.nextInt();
        if(sp > cp){
            System.out.println("profit");
        }else{
            System.out.println("Loss");
        }
    }
}
