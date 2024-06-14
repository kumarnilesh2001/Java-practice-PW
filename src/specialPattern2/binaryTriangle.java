package specialPattern2;

import java.util.Scanner;

public class binaryTriangle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();

        for(int i = 1; i <= n ; i++){
            for(int j = 1; j <=i; j++){

                // Methode 1

                if(i % 2 != 0){
                    if(j % 2 != 0){
                         System.out.print("1 ");
                    }else{
                        System.out.print("0 ");
                    }
                }else{
                    if(j % 2 == 0){
                        System.out.print("1 ");
                    }else{
                        System.out.print("0 ");
                    }
                }

                // Methode 2

//                if((i + j) % 2 == 0){
//                    System.out.print("1 ");
//                }else{
//                    System.out.print("0 ");
//                }

                // if you want to execute the comment one of the methode

            }
            System.out.println();
        }
    }
}
