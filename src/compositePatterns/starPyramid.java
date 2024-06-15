package compositePatterns;

import java.util.Scanner;

public class starPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();

        //methode 1

//        for(int i = 1; i <= n ; i++){
//            for(int j=1; j <= n-i;j++){
//                System.out.print("  ");
//            }
//            for(int k = 1; k<=(2*i)-1;k++){
//                System.out.print("* ");
//            }
//            System.out.println();

            //methode 2

        int nsp = n-1; //number of space
        int nst = 1; //number of star

        for(int i = 1; i <= n ; i++){
            for(int j=1; j <= nsp;j++){
                System.out.print("  ");
            }
            for(int k = 1; k<=nst;k++){
                System.out.print("* ");
            }
            System.out.println();
            nsp--;
            nst += 2;

        }
    }
}
