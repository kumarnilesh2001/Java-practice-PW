package Conditionals;

import java.util.Scanner;

public class areaPerimeterTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length : ");
        int length = sc.nextInt();
        System.out.print("Enter the breadth : ");
        int breadth = sc.nextInt();
        System.out.print("Enter the height : ");
        int height = sc.nextInt();

        int periMeter = 2 * (length + breadth);
        float area = (float) 1 / 2 * ( breadth * height);

        if( periMeter > area){
            System.out.println("Perimeter is greater than area");
        }else {
            System.out.println("Area is greater than perimeter");
        }
    }
}
