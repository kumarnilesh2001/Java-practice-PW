package compositePatterns;

import java.util.Scanner;

public class starBridge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();

        // methode 1

//        for(int i = 1; i <= 2*n-1; i++){
//            System.out.print("* ");
//        }
//        System.out.println();
//        n--;
//
//        int nsp = 1; //number of space print
//        for(int i = 1;i<=n;i++){
//            for(int j = 1; j<=n+1-i; j++){
//                System.out.print("* ");
//            }
//
//            for(int j = 1; j <= nsp; j++){
//                System.out.print("  ");
//            }
//
//            nsp += 2;
//
//            for(int j = 1; j<=n+1-i; j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

        //methode 2

        for(int i = 1; i <= 2*n-1; i++){
            System.out.print("* ");
        }
        System.out.println();
        n--;


        for(int i = 1;i<=n;i++){
            for(int j = 1; j<=n+1-i; j++){
                System.out.print("* ");
            }

            for(int j = 1; j <= 2*i-1; j++){
                System.out.print("  ");
            }


            for(int j = 1; j<=n+1-i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
