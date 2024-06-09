package specialPattern2;

import java.util.Scanner;

public class staPlus {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter n : ");
    int input = sc.nextInt();

    for(int i = 1; i <= input ;i++){
        for(int j = 1; j <= input ; j++){
            if(i == (input/2) + 1 || j == (input/2) + 1 ){
                System.out.print("* ");
            }else{
                System.out.print("  ");
            }
//
//            System.out.print(" *");
        }
        System.out.println();
    }

    }
}
